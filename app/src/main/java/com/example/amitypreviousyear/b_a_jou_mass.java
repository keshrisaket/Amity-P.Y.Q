package com.example.amitypreviousyear;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class b_a_jou_mass extends AppCompatActivity {

    Toolbar toolbar;

    Spinner sem1,sem2,sem3,sem4,sem5,sem6;
    AppCompatButton btnsem1,btnsem2,btnsem3,btnsem4,btnsem5,btnsem6;
    ArrayList<String> arrsem1=new ArrayList<>();
    ArrayList<String> arrsem2=new ArrayList<>();
    ArrayList<String> arrsem3=new ArrayList<>();
    ArrayList<String> arrsem4=new ArrayList<>();
    ArrayList<String> arrsem5=new ArrayList<>();
    ArrayList<String> arrsem6=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_jou_mass);


        sem1=findViewById(R.id.sem1);
        sem2=findViewById(R.id.sem2);
        sem3=findViewById(R.id.sem3);
        sem4=findViewById(R.id.sem4);
        sem5=findViewById(R.id.sem5);
        sem6=findViewById(R.id.sem6);

        btnsem1=findViewById(R.id.btn_sem1);
        btnsem2=findViewById(R.id.btn_sem2);
        btnsem3=findViewById(R.id.btn_sem3);
        btnsem4=findViewById(R.id.btn_sem4);
        btnsem5=findViewById(R.id.btn_sem5);
        btnsem6=findViewById(R.id.btn_sem6);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

        //for semester 1

        arrsem1.add("Understanding Mass Communication");
        arrsem1.add("Basics of Radio");
        arrsem1.add("Writing for Print");
        arrsem1.add("International Relations: Concepts and Theories");
        arrsem1.add("Graphics and Visual Communication");
        arrsem1.add("Communication Skills - I");


        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem1);
        sem1.setAdapter(adpsem1);


        btnsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/19wd99ZXSCJFtN5KUYxqQV8DHb2J_tGY6?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1WkguLJu5M6A6B7gQt68JSj5biCIod96K?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1EV2IXI-pbKbG8RRjusCtgoPwiGGE6HGY?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/15NDW006xdwTmJuxC6Cgfr8SMbrmjS6yb?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1rt7C-aeATeFh3gg1xeUHYaqA7uq-YQpr?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1yJBhmdyH_pPNW-JqX_NRjwSIhzsI-IwP?usp=drive_link");
                }
            }

        });


        // for semester 2
        arrsem2.add("News Analysis");
        arrsem2.add("Introduction to Radio and Audio Technique");
        arrsem2.add("Media Ethics and Laws");
        arrsem2.add("Photography theory & Practice");
        arrsem2.add("Design and Graphics");
        arrsem2.add("Communication Skills - II");



        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem2);
        sem2.setAdapter(adpsem2);


        btnsem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1giREpHf5YvwCZCob0iyzyXaNdNA2oKMt?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1zSZRWm9Zpynw48NidQKzG8cjsiT9aZu0?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1uQ0w7qOecj8jZ6O3KzBd1bf89PX2q_CP?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1EH3_Ki9-K48ptlOYCu7d3mJpSXpm3y3l?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1ASztViakewYuOk_eNftWhtanSn4wWUfO?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1ZfRQjYqegD4rPVfZYYntun5J5rHJjko1?usp=drive_link");
                }
            }

        });




        // for semester 3
        arrsem3.add("Advertising Concepts");
        arrsem3.add("Introduction to Media Research");
        arrsem3.add("Introduction to Television Production");
        arrsem3.add("Political leadership and government");
        arrsem3.add("Basics of Film Theory and Practice");
        arrsem3.add("Digital Photography");
        arrsem3.add("Term Paper");
        arrsem3.add("Individual Excellence & Social Dynamics");

        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem3);
        sem3.setAdapter(adpsem3);


        btnsem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1_ICbr4Ko_NfQlcrqEjbaL1ik3f4kZtAr?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1rzIelVrCWzcEq9T_PMstsHv8X16mLSeq?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1we5wufRqhk3h8hB9dUS3gKUAuYKHebED?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/10AlnoN4LRkbKilTkzLn7mFXtVTt-an5q?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/13qywMzPrmRus3hxivB448fNG37sXKoG-?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/14nBwa0UvWcDJhKQbIWfdexVluKvZ06vE?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1NV-eoO0Yjhq-vbTtKfaPUaXdl5UIrTdk?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1s2fdxcMnCnPpoUrkiVsevbEFIKHi6pWf?usp=drive_link");
                }
            }

        });

        // for semester 4
        arrsem4.add("Content Production for New Media");
        arrsem4.add("Screen Arts IV");
        arrsem4.add("Public Relations Concepts");
        arrsem4.add("Research Methodology");
        arrsem4.add("Environmental Studies");
        arrsem4.add("Creativity for Team Excellence");


        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem4);
        sem4.setAdapter(adpsem4);


        btnsem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/10yV-lnYhLEy1kB94bM5k8FBJCZdIANbJ?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1z-VcXO4QJ9tSSunD_Gj8NdpYtBRfy_NG?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1_dvB_m1xpdzi2kgNMwWGwBSZApQ1_c9l?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1GHbRiRLz-dDoSHbV5DpggWHWcD1sZ4bi?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1CcJ8hS9mVr2JW0BFDz6xUdI3Lto9g89H?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1eRzksbgjKbuWPanLwY_mNhPzpPjrTyjl?usp=drive_link");
                }
            }

        });

        // for semester 5
        arrsem5.add("Filmmaking Techniques");
        arrsem5.add("Brand Management");
        arrsem5.add("Summer Internship");
        arrsem5.add("Client Servicing and Creatives");
        arrsem5.add("Multimedia Production");
        arrsem5.add("Event Management Concepts");


        ArrayAdapter<String> adpsem5=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem5);
        sem5.setAdapter(adpsem5);


        btnsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1GPQFSvi1AEamMu13EwgpS6erZV7gGtNi?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1FeOYZGH9xJFflfAueLfwMrO799yqadTl?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/11JJWOni1DjI7Q8lIsHrKLtFwm0PhguBS?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1LOpAU-HDfpaeQXAPiip_tOa2Hj89Ql29?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1zYdZco-gefhbuTG2FWzA0OXqe_qAYvr_?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1_SzrFl0PoolZJ-PEkpiW57hGtC9Q_7uu?usp=drive_link");
                }
            }

        });

        // for semester 6
        arrsem6.add("Camera Operations");
        arrsem6.add("Ad Production and Campaign Planning");
        arrsem6.add("Digital Marketing & Content Development");
        arrsem6.add("Fiction Production");
        arrsem6.add("Advanced Cyber Media");
        arrsem6.add("Advanced Film Theory and Practice");
        arrsem6.add("Social Communication");
        arrsem6.add("Major Project");
        arrsem6.add("French Written Expression and Comprehension – II");

        ArrayAdapter<String> adpsem6=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem6);
        sem6.setAdapter(adpsem6);


        btnsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem6.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1HcNvacXq-G71VlbPP87vNpxxUsyrDfHK?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1vinPWaVa32HB5edjK3mHelqLkcM_JEtp?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1u--bMPMtA6jotFmVz9Vi8Uy48JoY8wt1?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1jegqhfi--UGYAEZtGICuu2DtJfuop_gR?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1ND2iESza7SZuOI4Yps7sBu3RTUzGyV1U?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1WFDhg6Y3a0osbopOKpv9aFPpB9xXEyRS?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/15Bm_OSeHny1nT4ev_VRL6Y-5RuWqlE-O?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1JZUJaGo_VgMFTZA-TTUnmEDEVK6FElYq?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1NscdwtEbUhhPVPgZGMv9llr1HynlrW--?usp=drive_link");
                }
            }

        });


    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    public  void goToUrl(String s){
        Uri u= Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,u);
        startActivity(intent);
    }
}