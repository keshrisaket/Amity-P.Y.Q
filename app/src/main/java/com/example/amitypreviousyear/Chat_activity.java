package com.example.amitypreviousyear;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.amitypreviousyear.adapter.MessageAdapter;
import com.example.amitypreviousyear.databinding.ActivityChatBinding;
import com.example.amitypreviousyear.modal.MessageModal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chat_activity extends AppCompatActivity {


    ActivityChatBinding binding;

    List<MessageModal> messageModalList;

    MessageAdapter adapter;

    String url= "https://api.openai.com/v1/chat/completions" ;

//    String accesstoken="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";


    String accesstoken="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";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        messageModalList = new ArrayList<>();




//        initialise adapter class

        adapter=new MessageAdapter(messageModalList);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.smoothScrollToPosition(adapter.getItemCount());
        binding.recyclerView.setAdapter(adapter);

        binding.sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String question=binding.editMessage.getText().toString().trim();

                addToRecyclerView(question,MessageModal.SENT_BY_ME);
                binding.editMessage.setText("");
                binding.askMeAnything.setVisibility(View.GONE);
                binding.bot.setVisibility(View.GONE);

                callApi(question);

            }
        });

        
    }

    public  void callApi(String question){

        messageModalList.add(new MessageModal("Working on it.......",MessageModal.SENT_BY_GPT));
        JSONObject parametter=new JSONObject();
        JSONArray jsonArraymessage= new JSONArray();
        JSONObject jsonObjectmessage= new JSONObject();

        try {
            parametter.put("model","gpt-3.5-turbo");
            jsonObjectmessage.put("role","user");
            jsonObjectmessage.put("content",question);
            jsonArraymessage.put(jsonObjectmessage);
            parametter.put("messages",jsonArraymessage);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        JsonObjectRequest request=new JsonObjectRequest(Request.Method.POST, url, parametter, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray jsonArray=response.getJSONArray("choices");
                    String answer=jsonArray.getJSONObject(0).getJSONObject("message").getString("content");
                    getGptResponse(answer);

                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                getGptResponse("Failed due to ...."+error.toString());
                Log.e("errorMessage",error.toString());

            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {

                Map<String, String> header=new HashMap<>();
                header.put("Authorization","Bearer "+accesstoken);
                header.put("Content-Type","application/json");
                return header;

            }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(request);

    }

    private void getGptResponse(String answer) {
        messageModalList.remove(messageModalList.size()-1);
        addToRecyclerView(answer,MessageModal.SENT_BY_GPT);
    }

    @SuppressLint("NotifyDataSetChanged")
    private void addToRecyclerView(String question, String sentBy) {
        messageModalList.add(new MessageModal(question,sentBy));
        adapter.notifyDataSetChanged();
        binding.recyclerView.smoothScrollToPosition(adapter.getItemCount());

    }


}