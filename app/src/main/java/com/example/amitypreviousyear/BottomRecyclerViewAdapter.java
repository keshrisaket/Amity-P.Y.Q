package com.example.amitypreviousyear;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;



public class BottomRecyclerViewAdapter extends RecyclerView.Adapter<BottomRecyclerViewAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    Context context;
    private OnItemClickListener listener;
    ArrayList<bottom_recycler_view> courseList=new ArrayList<>();
    public  BottomRecyclerViewAdapter(Context context,ArrayList<bottom_recycler_view> courseList,  OnItemClickListener listener){
        this.context=context;
        this.courseList=courseList;
        this.listener=listener;
    }
    @NonNull
    @Override
    public BottomRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.bpttom_recycler,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BottomRecyclerViewAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        bottom_recycler_view item = courseList.get(position);

        holder.textView.setText(courseList.get(position).course);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(v, position); // Trigger the listener's method
            }
        });

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{

        TextView textView;
        LottieAnimationView courseImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.bottom_course);
            courseImage=itemView.findViewById(R.id.bottom_image);
        }
    }
}
