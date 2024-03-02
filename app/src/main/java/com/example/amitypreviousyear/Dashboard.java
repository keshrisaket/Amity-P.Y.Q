package com.example.amitypreviousyear;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.airbnb.lottie.LottieAnimationView;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity implements BottomRecyclerViewAdapter.OnItemClickListener {


    private  static final String CHANNEL_ID="MY CHANNEL";
    private  static final int ID= 1;
    Toolbar toolbar;

    Vibrator vibrator;



    LottieAnimationView ai;
    RecyclerView recyclerViewTop;

    static RecyclerView recyclerViewBottom;

    ArrayList<top_recycler_view> topRecyclerViews=new ArrayList<>();

    ArrayList<bottom_recycler_view> bottomRecyclerViews=new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        recyclerViewTop=findViewById(R.id.toprecyclerview);
        recyclerViewBottom=findViewById(R.id.bottom_recycler);
        ai=findViewById(R.id.ai);
        vibrator= (Vibrator) getSystemService(VIBRATOR_SERVICE);


        // notification

        Intent iNotify=new Intent(this,Dashboard.class);
        iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pi=PendingIntent.getActivity(this,ID,iNotify,PendingIntent.FLAG_UPDATE_CURRENT);

        Drawable drawable= ResourcesCompat.getDrawable(getResources(), R.drawable.key,null);
        BitmapDrawable bitmapDrawable=(BitmapDrawable) drawable;
        assert bitmapDrawable!= null;
        Bitmap largeicom=bitmapDrawable.getBitmap();

        NotificationManager notification=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification1;

        if (android.os.Build.VERSION.SDK_INT>= android.os.Build.VERSION_CODES.O){

            notification1=new Notification.Builder(this)
                    .setLargeIcon(largeicom)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentText("We define your success")
                    .setSubText("WELCOME")
                    .setChannelId(CHANNEL_ID)
                    .setContentIntent(pi)
                    .build();

            notification.createNotificationChannel(new NotificationChannel(CHANNEL_ID,"new channel",
                    NotificationManager.IMPORTANCE_HIGH));
        }else {
            notification1=new Notification.Builder(this)
                    .setLargeIcon(largeicom)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentText("We define your success")
                    .setSubText("WELCOME")
                    .setContentIntent(pi)
                    .build();

        }

        notification.notify(ID,notification1);







        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent=new Intent(Dashboard.this,Chat_activity.class);
                 startActivity(intent);
            }
        });

        LinearLayoutManager linearLayoutManagerbottom=new LinearLayoutManager(getApplicationContext());
        recyclerViewBottom.setLayoutManager(linearLayoutManagerbottom);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        recyclerViewTop.setLayoutManager(linearLayoutManager);
        recyclerViewTop.setHasFixedSize(true);




        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
        getSupportActionBar().setTitle("");
        }


        topRecyclerViews.add(new top_recycler_view(R.raw.bca_animation,"MCA"));
        topRecyclerViews.add(new top_recycler_view(R.raw.b_com_animation,"BCA"));
        topRecyclerViews.add(new top_recycler_view(R.raw.mca_animation,"BCA (Honours/Research)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.b_tec_animation,"BCA+MCA (Dual)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.b_a_aanimation,"B.Com (Honours/Research)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.mca_animation,"B.Com (Honours)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.bca_animation,"B.Tech (Civil Engineering)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.b_com_animation,"B.Tech (Computer Science)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.b_tec_animation,"B.A (Mass Communication)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.b_a_aanimation,"BBA LL.B (Hons)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.mca_animation,"B.Sc (Clinical Psychology)"));
        topRecyclerViews.add(new top_recycler_view(R.raw.b_com_animation,"B.A.Journalism      (Honours)"));


      topRecyclerViewAdapter topAdapter=new topRecyclerViewAdapter(getApplicationContext(),topRecyclerViews);
      recyclerViewTop.setAdapter(topAdapter);




//        bottom recycler view

//        bottomRecyclerViews.add(new bottom_recycler_view("M.C.A",R.raw.b_a_aanimation));
//        bottomRecyclerViews.add(new bottom_recycler_view("B.C.A",R.raw.b_com_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("B.Com",R.raw.b_tec_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("B.Tec (Com & eng)",R.raw.bca_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("B.A (English hon's)",R.raw.mca_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("BBA.LLB",R.raw.b_a_aanimation));
//        bottomRecyclerViews.add(new bottom_recycler_view("B.Tec (Civil eng)",R.raw.b_com_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("B.B.A",R.raw.b_tec_animation));
//
//
////        new data
//        bottomRecyclerViews.add(new bottom_recycler_view("B.A(Jou & Ma.Com)",R.raw.bca_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("B.A (Administration)",R.raw.mca_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("B.B.A - M.B.A (Inte)",R.raw.b_tec_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("M.Com",R.raw.b_a_aanimation));
//        bottomRecyclerViews.add(new bottom_recycler_view("M.A(Jou & Ma.Co)",R.raw.b_com_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("M.A (English)",R.raw.b_tec_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("LLB (Hons)",R.raw.bca_animation));
//        bottomRecyclerViews.add(new bottom_recycler_view("M.B.A",R.raw.b_a_aanimation));
//


        bottomRecyclerViews.add(new bottom_recycler_view("M.C.A"));
        bottomRecyclerViews.add(new bottom_recycler_view("B.C.A"));
        bottomRecyclerViews.add(new bottom_recycler_view("B.Com"));
        bottomRecyclerViews.add(new bottom_recycler_view("B.Tec (Com & eng)"));
        bottomRecyclerViews.add(new bottom_recycler_view("B.A (English hon's)"));
        bottomRecyclerViews.add(new bottom_recycler_view("BBA.LLB"));
        bottomRecyclerViews.add(new bottom_recycler_view("B.Tec (Civil eng)"));
        bottomRecyclerViews.add(new bottom_recycler_view("B.B.A"));


//        new data
        bottomRecyclerViews.add(new bottom_recycler_view("B.A(Jou & Ma.Com)"));
        bottomRecyclerViews.add(new bottom_recycler_view("B.A (Administration)"));
        bottomRecyclerViews.add(new bottom_recycler_view("B.B.A - M.B.A (Inte)"));
        bottomRecyclerViews.add(new bottom_recycler_view("M.Com"));
        bottomRecyclerViews.add(new bottom_recycler_view("M.A(Jou & Ma.Co)"));
        bottomRecyclerViews.add(new bottom_recycler_view("M.A (English)"));
        bottomRecyclerViews.add(new bottom_recycler_view("LLB (Hons)"));
        bottomRecyclerViews.add(new bottom_recycler_view("M.B.A"));











//        BottomRecyclerViewAdapter bottomRecyclerViewAdapter=new BottomRecyclerViewAdapter(getApplicationContext(),bottomRecyclerViews, (BottomRecyclerViewAdapter.OnItemClickListener) this);
//        recyclerViewBottom.setAdapter(bottomRecyclerViewAdapter);

//
//        SetupRecyclerViewThread setupThread = new SetupRecyclerViewThread(getApplicationContext(), bottomRecyclerViews, this);
//        setupThread.start();






        // Call the method to set up RecyclerView using background thread
        setupRecyclerViewInBackground();






    }



    // Method to set up the RecyclerView using a background thread
    private void setupRecyclerViewInBackground() {
        SetupRecyclerViewThread setupThread = new SetupRecyclerViewThread(Dashboard.this, bottomRecyclerViews, this);
        setupThread.start();
    }


    @Override
    public void onItemClick(View view, int position) {
        vibrator.vibrate(30);
        // Handle click event at the desired position
        if (position==0){
            Intent intent=new Intent(Dashboard.this, m_c_a.class);
            intent.putExtra("course","M.C.A");
            startActivity(intent);
        }else if (position==1){
            Intent intent=new Intent(Dashboard.this, b_c_a.class);
            intent.putExtra("course","B.C.A");
            startActivity(intent);
        } else if (position==2) {
            Intent intent=new Intent(Dashboard.this, b_com.class);
            intent.putExtra("course","B.Com");
            startActivity(intent);
        } else if (position==3) {
            Intent intent=new Intent(Dashboard.this, b_tec_computer.class);
            intent.putExtra("course","B.Tec");
            startActivity(intent);
        }else if (position==4){
            Intent intent=new Intent(Dashboard.this, b_a_english.class);
            intent.putExtra("course","B.A");
            startActivity(intent);
        } else if (position==5) {
            Intent intent=new Intent(Dashboard.this, bba_llb.class);
            intent.putExtra("course","BBA.LLB");
            startActivity(intent);
        }else if (position==6){
            Intent intent=new Intent(Dashboard.this, b_tec_civil.class);
            intent.putExtra("course","B.S.C");
            startActivity(intent);
        }else if (position==7){
            Intent intent=new Intent(Dashboard.this, b_b_a.class);
            intent.putExtra("course","B.B.A");
            startActivity(intent);
        } else if (position==8) {
            Intent intent=new Intent(Dashboard.this, b_a_jou_mass.class);
            intent.putExtra("course","B A (Jour and mass com)");
            startActivity(intent);
        }else if (position==9){
            Intent intent=new Intent(Dashboard.this, b_a_administration.class);
            intent.putExtra("course","B A (Administration)");
            startActivity(intent);
        }else if (position==10){
            Intent intent=new Intent(Dashboard.this, bba_mba_integrated.class);
            intent.putExtra("course","BBA - MBA(INTEGRATED)");
            startActivity(intent);
        }else if (position==11){
            Intent intent=new Intent(Dashboard.this, m_com.class);
            intent.putExtra("course","M Com");
            startActivity(intent);
        }else if(position==12){
            Intent intent=new Intent(Dashboard.this,ma_jour_mass_comunication.class);
            intent.putExtra("course","MA (JOURNALISM AND MASS COMMUNICATION)");
            startActivity(intent);
        }
        else if (position==13){
            Intent intent=new Intent(Dashboard.this,ma_english.class);
            intent.putExtra("course","M A (english)");
            startActivity(intent);
        }else if (position==14){
            Intent intent=new Intent(Dashboard.this, llb_hons.class);
            intent.putExtra("course","LLB (Hons)");
            startActivity(intent);
        }else if (position==15){
            Intent intent=new Intent(Dashboard.this, m_b_a.class);
            intent.putExtra("course","MBA");
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
     new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId=item.getItemId();

        if (itemId==R.id.first){

            Intent iEmail=new Intent(Intent.ACTION_SEND);
            iEmail.setType("message/rfc822");
            iEmail.putExtra(Intent.EXTRA_SUBJECT,"Bug Reporting");
            iEmail.putExtra(Intent.EXTRA_EMAIL,new String[]{"keshrisaket414@gmail.com"});
            iEmail.putExtra(Intent.EXTRA_TEXT,"Please solve this ");
            startActivity(Intent.createChooser(iEmail,"Email via"));


        }else if (itemId==R.id.second){

            Intent intent=new Intent(Dashboard.this,report_bug.class);
            startActivity(intent);


        }else if (itemId==R.id.three){
            Uri u= Uri.parse("https://docs.google.com/document/d/e/2PACX-1vRzK1cbAX2bWEjMV-0fhZRFXZJcIr2zag3aQjUxKR209Sj4Ly-zzhkSy6JQ_hTzPxaQWO3TwJoTM9Xg/pub");
            Intent intent=new Intent(Intent.ACTION_VIEW,u);
            startActivity(intent);

        }else if (itemId==R.id.four){

            Uri u= Uri.parse("https://docs.google.com/document/d/e/2PACX-1vTTUyTvUjitiowBpO1zjdw85mFRM0it42iCcIMkswSnqwBcU4AUoSHT3YrlnuMVASfdnZYdzPJAtUqY/pub");
            Intent intent=new Intent(Intent.ACTION_VIEW,u);
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {

        Dialog custDialog=new Dialog(Dashboard.this);
        custDialog.setContentView(R.layout.cust_dialog_in_backpressed);
        custDialog.setCancelable(false);

        AppCompatButton stay=custDialog.findViewById(R.id.stay_btn);
        AppCompatButton exit=custDialog.findViewById(R.id.exit_btn);

        stay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Dashboard.this, "WELCOME BACK", Toast.LENGTH_SHORT).show();
                custDialog.dismiss();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dashboard.super.onBackPressed();
                custDialog.dismiss();
            }
        });

        custDialog.show();


    }
}