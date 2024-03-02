package com.example.amitypreviousyear.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amitypreviousyear.R;
import com.example.amitypreviousyear.modal.MessageModal;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.viewHolder> {

    List<MessageModal> messageModalList;

    public MessageAdapter(List<MessageModal> messageModalList) {
        this.messageModalList = messageModalList;
    }

    @NonNull
    @Override
    public MessageAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_layout,null);
        viewHolder holder=new viewHolder(view);

        return holder ;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.viewHolder holder, int position) {

        MessageModal message =messageModalList.get(position);
        if (message.getSent_by().equals(MessageModal.SENT_BY_ME)){

            holder.top_chatViewL.setVisibility(View.VISIBLE);
            holder.top_textView.setText(message.getMessage());

            holder.bottom_chatViewL.setVisibility(View.GONE);

            holder.user_name.setText("Me");
            holder.sender_image.setImageResource(R.drawable.baseline_person_24);


        }else{


            holder.top_chatViewL.setVisibility(View.GONE);
            holder.bottom_textView.setText(message.getMessage());

            holder.bottom_chatViewL.setVisibility(View.VISIBLE);

            holder.user_name.setText("BOT");
            holder.sender_image.setImageResource(R.drawable.baseline_arrow_circle_right_24);


        }

    }

    @Override
    public int getItemCount() {
        return messageModalList.size();
    }

    public class viewHolder  extends RecyclerView.ViewHolder{

        LinearLayout top_chatViewL,bottom_chatViewL;

        TextView top_textView,bottom_textView,user_name;
        ImageView sender_image;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            top_chatViewL=itemView.findViewById(R.id.top_chatView);
            bottom_chatViewL=itemView.findViewById(R.id.bottom_chatView);


            top_textView=itemView.findViewById(R.id.top_text);
            bottom_textView=itemView.findViewById(R.id.bottom_text);


            user_name=itemView.findViewById(R.id.text_name);
            sender_image=itemView.findViewById(R.id.profile_image);


        }
    }
}
