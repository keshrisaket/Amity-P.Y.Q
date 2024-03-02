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

public class ma_jour_mass_comunication extends AppCompatActivity {

    Toolbar toolbar;


    AppCompatButton but_sem1,but_sem2,but_sem3,but_sem4;

    Spinner sem1,sem2,sem3,sem4;

    ArrayList<String> sem1arr=new ArrayList<>();
    ArrayList<String> sem2arr=new ArrayList<>();
    ArrayList<String> sem3arr=new ArrayList<>();
    ArrayList<String> sem4arr=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_jour_mass_comunication);



        sem1=findViewById(R.id.sem1);
        sem2=findViewById(R.id.sem2);
        sem3=findViewById(R.id.sem3);
        sem4=findViewById(R.id.sem4);
        but_sem1=findViewById(R.id.btn_sem1);
        but_sem2=findViewById(R.id.btn_sem2);
        but_sem3=findViewById(R.id.btn_sem3);
        but_sem4=findViewById(R.id.btn_sem4);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }


        // for semester 1
        sem1arr.add("Cinema and Gender");
        sem1arr.add("Visualization & Media Design");
        sem1arr.add("Writing & Analysis for Print");
        sem1arr.add("Mass Communication Theory & Practice");
        sem1arr.add("Photography Concepts & Practice");
        sem1arr.add("Professional & Business Communication");


        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem1arr);
        sem1.setAdapter(adpsem1);


        but_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1uLBOZTdWLYM3LUaHJKwRddBY4Nhti7Wq?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1HAelMtQsOElvEaXYzlxePJZej8PoYlj9?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1CMnrEDpxChHDjHMbNQeMe87awGUxutvr?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/172N6RlMpoDjVCe7UMsItRXIhkhK8ceVy?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1JzTL5_6c4KLXni4HIokSgia58acH16iE?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1Z8oAry_fgy1QdnjXiCIEpdcCbFwYNYE2?usp=drive_link");
                }
            }
        });


        // for semester 2
        sem2arr.add("Cross-Cultural Communication");
        sem2arr.add("Media Ethics Laws and Governance");
        sem2arr.add("Development Planning");
        sem2arr.add("Current Affairs and Media Analysis");
        sem2arr.add("Television News and Production");
        sem2arr.add("Marketing Management");
        sem2arr.add("Conference");
        sem2arr.add("Cognitive Analytics & Social Skills for Professional Development");


        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem2arr);
        sem2.setAdapter(adpsem2);


        but_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1N5ZaLI_-VsfKjwcTpvEbtvkgXTTBEj_J?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1jVGIjrvMH8wpuDxeQD2rd62qUO6Pe-SX?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/175OgnS9WH0-pfRilXwiAE9hLIV_kJFcC?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1Li1P4GijeUxAr0UILdctnuwPERifefQg?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1Ac2xkjjIX2yH46WfbgRamCt0UdzhVjxX?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/11pKDvqMur33FFpkrdG3sC00mn7dT-xrR?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1Pg-Efd4ddNMevZKqUaCjwtUS2rmZH6jf?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1lbO-O1Cdwv8YNtOHvsCdZAZKB9Qp5rHE?usp=drive_link");
                }
            }
        });

        // for semester 3
        sem3arr.add("Film Theory and Practice");
        sem3arr.add("New Media and Digital Technology");
        sem3arr.add("Media Research & Application");
        sem3arr.add("Advertising and Promotions");
        sem3arr.add("Public Relations and Events");
        sem3arr.add("Data Journalism");
        sem3arr.add("Summer Internship");


        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem3arr);
        sem3.setAdapter(adpsem3);


        but_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1mCTcPpUhHalNQjVxDy-EDhF--gMAy2CC?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1oCwk4k49KTK_dJaPrOgkfL4ERdx7POP-?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1wAqPB_4-ugx-CVg1E9bSTdttbz5fSp2J?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1fJHX37bGC0yQJ8KwbvJtvbEMXsAREL7S?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1_NUAI_tNraVogOB0F3r-8GmgaIEQAGi5?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1VdKkHacn-A_ectS0dHSHxHjXqWPKF8Ga?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/15DuiCIpctBpoF7si2bPAPnWaHhmCdWhz?usp=drive_link");
                }
            }
        });

        // for semester 4
        sem4arr.add("Anchoring and Presentation for Radio and TV");
        sem4arr.add("Sports Reporting");
        sem4arr.add("Gender, Human Rights and Media");
        sem4arr.add("Political Communication");
        sem4arr.add("Media, CSR & Sustainable Development");
        sem4arr.add("Dissertation");



        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem4arr);
        sem4.setAdapter(adpsem4);




        but_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1CQDYd0nRnrkQIW0B_t65l39B4UclBoSU?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1KMwB16LU6OoBSiAPLw0jbyYp-cu7jgSi?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1cKs_d_4VF1uCkof_RWhQDkf7LG4q_Sh1?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1jTvg2vkjMJO3TnMRopKgNBsGV9M_8K_h?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1A48-u7oOstbac64nKK9ybeC74uC3yWxy?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1DikUi-d4mkcVEFChWR8hD6gJF5CTeN05?usp=drive_link");
                }
            }
        });






    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    public void goToUrl(String s){
        Uri uri=Uri.parse(s);

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}