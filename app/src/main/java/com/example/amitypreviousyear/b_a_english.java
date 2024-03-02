package com.example.amitypreviousyear;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class b_a_english extends AppCompatActivity {

    Toolbar toolbar;

    Spinner sem1,sem2,sem3,sem4,sem5,sem6;

    ArrayList<String> arrsem1=new ArrayList<>();
    ArrayList<String> arrsem2=new ArrayList<>();
    ArrayList<String> arrsem3=new ArrayList<>();
    ArrayList<String> arrsem4=new ArrayList<>();
    ArrayList<String> arrsem5=new ArrayList<>();
    ArrayList<String> arrsem6=new ArrayList<>();

    AppCompatButton btn_sem1,btn_sem2,btn_sem3,btn_sem4,btn_sem5,btn_sem6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba);

        sem1=findViewById(R.id.sem1);
        sem2=findViewById(R.id.sem2);
        sem3=findViewById(R.id.sem3);
        sem4=findViewById(R.id.sem4);
        sem5=findViewById(R.id.sem5);
        sem6=findViewById(R.id.sem6);

        btn_sem1=findViewById(R.id.btn_sem1);
        btn_sem2=findViewById(R.id.btn_sem2);
        btn_sem3=findViewById(R.id.btn_sem3);
        btn_sem4=findViewById(R.id.btn_sem4);
        btn_sem5=findViewById(R.id.btn_sem5);
        btn_sem6=findViewById(R.id.btn_sem6);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }


        // for semester 1

        arrsem1.add("History of English Literature");
        arrsem1.add("Environmental Studies - I");
        arrsem1.add("English Poetry From Chaucer to Blake");
        arrsem1.add("Drama From Elizabethan to Restoration Age");
        arrsem1.add("Elementary Sociology- I");
        arrsem1.add("History -an Introduction");
        arrsem1.add("Communication Skills - I");


        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,arrsem1);
        sem1.setAdapter(adpsem1);


        btn_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1jG7VF7qxMw6_UIgjTCgtvW7uasm7BdvN?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1UzZcQqfA_sfVGmt4c1I8XCKdMxZccL1y?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1JyQpiKX58AE5Y3Ib0_k7MKioW1hx-oQS?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1N7iutjFdaE0ZdzNBpp2tXjSExcFZKjJg?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/18bfmRtyfS6Xw9nz0WiJe1NtZuAkWAZ_C?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/19JWhqvvFqZzILFfhQRoD9sbpCW0o7k2s?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/15xkyq99lTWs3AJLidO2UGkr-DpcBqLID?usp=drive_link");
                }
            }
        });

        // for semester 2
        arrsem2.add("20th Century Indian English Prose");
        arrsem2.add("English Poetry From Wordsworth to Tennyson");
        arrsem2.add("20th Century Indian English Drama");
        arrsem2.add("American Novel");
        arrsem2.add("History - The Gupta Age to 650 Ad");
        arrsem2.add("Psychology - II");
        arrsem2.add("Elementary Sociology- I");
        arrsem2.add("Communication Skills - II");

        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,arrsem2);
        sem2.setAdapter(adpsem2);


        btn_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1o8Y1dbv4eLFHpO-GHLd5LGI8yn0cAVxA?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1mM5BOOVU8v6DXPQqte6tVepxyMFjh35h?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/19tEqMlWyzWdq3jBdAF9Du5vkRdTb38i6?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1jY7KEY9ff_L-ABY3YL4dkWfJ717zFbYa?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/12MK-_pW6YpqiHL5GMXAcYiohpMyeHTsK?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/14UP_wTRAaBFdefSdFusauhRqPtxr1tDV?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1jgQ5Ex7rbWInmQF8SDzpJYlskFnaNwlE?usp=drive_link");
                } else if (position==7) {
                    goToUrl("https://drive.google.com/drive/folders/1cGKQwXTNYlib4g_H4XXfMFpNqJ8EdYmi?usp=drive_link");
                }
            }
        });


        // for semester 3
        arrsem3.add("Introduction to Literary Criticism");
        arrsem3.add("English Novel");
        arrsem3.add("Elementary Sociology- II");
        arrsem3.add("Creative Writing in English");
        arrsem3.add("Prose Down The Ages");
        arrsem3.add("Summer Project - I");
        arrsem3.add("American Drama");
        arrsem3.add("Individual Excellence & Social Dynamics");


        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,arrsem3);
        sem3.setAdapter(adpsem3);


        btn_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1ngQJO1JsPVwG9DxdDTwS99So_BqDolls?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/18CJ8lyag612tssudyuAqbhu0QCgLCGE-?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/16fuMhS7bgNX9wR365lM1UmVJAk1flhrc?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1qTGG9-DJjvgtr3FY9dgx2MjA3dhYObkU?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1AKYuCDDTEHtrU0MQxgV8SuMbHuxhEF6k?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1fUXsq4jwhN-gzdc-pI-smZX5ZaXvjgeA?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1IGDCumlKZ4iJbXNLYHmrSaQBpd8HmW_b?usp=drive_link");
                } else if (position==7) {
                    goToUrl("https://drive.google.com/drive/folders/1FeLC1t2g_cm5hU3m-ZtvTyQUIjAxS5Gn?usp=drive_link");
                }
            }
        });

        // for semester 4
        arrsem4.add("Creativity for Team Excellence");
        arrsem4.add("Introduction to Literary Theory");
        arrsem4.add("Modern Drama");
        arrsem4.add("Literature and Secularism");
        arrsem4.add("Advanced Creative Writing in English");
        arrsem4.add("American Poetry");
        arrsem4.add("Minor Project");



        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,arrsem4);
        sem4.setAdapter(adpsem4);


        btn_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1b7DfMw9PkeJt9jQTHdnddkbxWYRTcaOm?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1qM2cZnExuWNflZQB9AChtIXu9wFHFC-I?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/15Abg21oSxqBVF_uj1czXEmXMHEWr9g9j?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/149AoIWq_5bNTorvYYoHa0yGfO90NZSyb?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1nIcs7INCyl4G45Xgr6MNzdL-tXsuzwRL?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1um6V6DcqZgdDA03EJ4_K_ISc2Utb5Jh-?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1evIXJ6EgkSDy1E46_thjE4jXUO6yTSYd?usp=drive_link");
                }
            }
        });

        // for semester 5
        arrsem5.add("Modern English Poetry");
        arrsem5.add("Modern English Novel");
        arrsem5.add("History of English Language");
        arrsem5.add("African Literature");
        arrsem5.add("Fundamentals of Research Methods in Global Environment");
        arrsem5.add("Summer Project - II");
        arrsem5.add("Australian Literature");


        ArrayAdapter<String> adpsem5=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,arrsem5);
        sem5.setAdapter(adpsem5);


        btn_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1_9iVKq-mqYS764wIjIBch5Ut6IykCUUD?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/16A9kkpTdntS0q3i4vTe6-emxpvIofCta?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1wk6ev_4qgww_crGGyOfPE0kFKj93FFri?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1uwqXblHlkSeNf385piCNHibwcZ86u1Ph?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1pUFFQuXd_93OI0WDq_yMg8Mcs-fHw28f?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1hKF0PJ4VV62YZhNocIYDcHwmelydrumo?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1wc38YS9mAzT0kCPYV3Mjw66t7HBxZEL0?usp=drive_link");
                }
            }
        });

        // for semester 6

        arrsem6.add("Contemporary Canadian Fiction");
        arrsem6.add("Modern European Drama");
        arrsem6.add("Introduction to Linguistics");
        arrsem6.add("Classical Indian Literature in Translation");
        arrsem6.add("Major Project - I");



        ArrayAdapter<String> adpsem6=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_spinner_dropdown_item,arrsem6);
        sem6.setAdapter(adpsem6);


        btn_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem6.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1DdzXtzaQaSS6XuGdoGW3Ica-RUG7GpXd?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1xaVFwNRe20GdqaVz6iQoKt872vtgru90?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1IlChqcTAyZmRXRZ0No7mssHPrTprkfmH?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1wpG2kY222Fwy63l8yl_Arxm7nQVlCMXw?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1w2pgfV-KjQsL0sfU3ewRdWDiyCIF0n7w?usp=drive_link");
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
        Uri u=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,u);
        startActivity(intent);
    }
}