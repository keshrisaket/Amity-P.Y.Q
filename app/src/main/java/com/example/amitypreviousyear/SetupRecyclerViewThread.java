package com.example.amitypreviousyear;




import static com.example.amitypreviousyear.Dashboard.recyclerViewBottom;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class SetupRecyclerViewThread extends Thread {
    private Context context;
    private List<bottom_recycler_view> bottomRecyclerViews;
    private BottomRecyclerViewAdapter.OnItemClickListener listener;

    public SetupRecyclerViewThread(Context context, List<bottom_recycler_view> bottomRecyclerViews, BottomRecyclerViewAdapter.OnItemClickListener listener) {
        this.context = context;
        this.bottomRecyclerViews = bottomRecyclerViews;
        this.listener = listener;
    }

    @Override
    public void run() {
        // Simulate heavy operation (replace this with your actual setup code)
        try {
            Thread.sleep(1000); // Example delay, replace with actual setup code
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Update UI on the main thread
        ((Dashboard) context).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                BottomRecyclerViewAdapter bottomRecyclerViewAdapter = new BottomRecyclerViewAdapter(context, (ArrayList<bottom_recycler_view>) bottomRecyclerViews, listener);
                recyclerViewBottom.setAdapter(bottomRecyclerViewAdapter);
            }
        });
    }
}

