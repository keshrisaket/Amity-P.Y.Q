package com.example.amitypreviousyear;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class topRecyclerViewAdapter extends RecyclerView.Adapter<topRecyclerViewAdapter.ViewHolder> {


    Context context;
    ArrayList<top_recycler_view> topView;

    public topRecyclerViewAdapter(Context context, ArrayList<top_recycler_view> topView){
        this.context=context;
        this.topView=topView;

    }
    @NonNull
    @Override
    public topRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(context).inflate(R.layout.top_recycler,parent,false);
        ViewHolder view =new ViewHolder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull topRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.courseImage.setAnimation(topView.get(position).image);
        holder.course.setText(topView.get(position).course);
    }

    @Override
    public int getItemCount() {
        return topView.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder {

        LottieAnimationView courseImage;
        TextView course;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            courseImage=itemView.findViewById(R.id.course_image);
            course=itemView.findViewById(R.id.course);


        }
    }
}
