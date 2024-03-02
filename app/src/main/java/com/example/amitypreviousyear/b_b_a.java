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

public class b_b_a extends AppCompatActivity {

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
        setContentView(R.layout.activity_bb);

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

        // for semester 1
        arrsem1.add("Accounting Fundamentals");
        arrsem1.add("Introduction to Management Principles");
        arrsem1.add("Principles of Marketing- I");
        arrsem1.add("Business Mathematics I");
        arrsem1.add("Introduction to Business Economics");
        arrsem1.add("Computer Applications");
        arrsem1.add("Business Ethics and Governance");
        arrsem1.add("Communication Skills - I");


        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem1);
        sem1.setAdapter(adpsem1);

        btnsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1mTCgdKikURxE3a2yG4PhXw2DOEEDWgRN?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1qWL4EK6gvgrwqUzYhZOgY-g9it3v13-I?usp=drive_link");
                }else if(position==2){
                    goToUrl("https://drive.google.com/drive/folders/13Mr_C7lI2c51G6LmjSc7SXVZChpbBdkh?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1xHsC6wWTXmM9fRGxtF4unDXBReUUyUjB?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1cOWPwAeGx4MqFZUmnxaDqNAEeyi6akum?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1iEgquZy_48M72qyW5yv6vjcwvZXVSIqG?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1lT-vOUXLdoe_9hNovlHhCpsTad_2zD9X?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1gFrleuGYZ3PXbvIR6heCDeKYJFVZSFp2?usp=drive_link");
                }
            }
        });


        // for semester 2
        arrsem2.add("Understanding Organizational Behavior");
        arrsem2.add("Principles of Marketing- II");
        arrsem2.add("Business Environment");
        arrsem2.add("Business Statistics");
        arrsem2.add("Cost and Management Accounting");
        arrsem2.add("Business Law");
        arrsem2.add("Term Paper");
        arrsem2.add("Environmental Studies - II");
        arrsem2.add("Communication Skills - II");

        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem2);
        sem2.setAdapter(adpsem2);

        btnsem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1BiBTayX7k-FdylqERIDtGnbo1dVVec96?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1W2vMlR-kb3sN9ZC4bwtbBKF9zMvdkFWw?usp=drive_link");
                }else if(position==2){
                    goToUrl("https://drive.google.com/drive/folders/1lNZciGfEU0rzVBSI2Oxgokwnrq9cd5kU?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1HZdFJ8qDtNwxK9xacSSGKhzwh4WvrjpM?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1hEmvsTSkRq4aPCOkx5rZMcDDMlxtx2jv?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1HBTMHpMeoM5-NOyXp6EMDVnugwESrG8-?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1p6xVi2p0wThItm-nJOzwF6IJPoB7tkx9?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1GRfw-Mhxq-qkFq6KV97Pb5aLG_X1YWpw?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1tLjDrOIgTClDajIwTpoOQEG4vh_XIYX6?usp=drive_link");
                }
            }
        });

        // for semester 3
        arrsem3.add("Fundamentals of Financial Management");
        arrsem3.add("Fundamentals of Human Resource Management");
        arrsem3.add("Fundamentals of Research Methods in Global Environment");
        arrsem3.add("Managing Customer Relationships");
        arrsem3.add("ESSENTIALS OF PRODUCTION AND OPERATIONS MANAGEMENT");
        arrsem3.add("Strategizing using Innovation");
        arrsem3.add("Term Paper - I");
        arrsem3.add("Individual Excellence & Social Dynamics");



        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem3);
        sem3.setAdapter(adpsem3);

        btnsem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/19WKBFLRoi1Ep5YdormwahCLuTOu-ifEi?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1WmbhArqclJfP8rQzrv7bdUdxQ4-xKd7b?usp=drive_link");
                }else if(position==2){
                    goToUrl("https://drive.google.com/drive/folders/1edr135lZj7N_RlYNFlHCEFkN-tm_A4ER?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1yI84o1ncUZsW7k_0oChBrSyQ-EsazzqT?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1IJq0fwBbjUhPdOg-cseeJNkLCb86H1u6?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1GsJag9V6IkJ9SBbN7NScwohaX_t6Rb_i?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1xgPhZjljmVgJcSIJsXVRUctrGn1drEUO?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1v4s6RdOyq28RcCnpKPBDxBX2LTj_rxdr?usp=drive_link");
                }
            }
        });

        // for semester 4
        arrsem4.add("Export Management");
        arrsem4.add("International Marketing");
        arrsem4.add("Operations Research");
        arrsem4.add("RESEARCH METHODS FOR MANAGERS");
        arrsem4.add("Corporate Tax Planning");
        arrsem4.add("Fundamentals of Project Management");
        arrsem4.add("Banking and Financial Institutions");
        arrsem4.add("Creativity for Team Excellence");


        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem4);
        sem4.setAdapter(adpsem4);

        btnsem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1qCDBOPLd-abhmaWzy0qEpoep9HV4ZPhO?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1D0x71y5g_Icfhxv6kKQXRZNIrCzk4lAN?usp=drive_link");
                }else if(position==2){
                    goToUrl("https://drive.google.com/drive/folders/1Ty0Y56N9EjYvqTpRzq35wMIFFfq9yrlB?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1muWCNIaQ3FOhjIwgmfBX1eGXExovaTsJ?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1BNhHMZvSjgA0qVdyOYNQe9XPWGV92-GD?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1nhLlqPP9tUwFsipREAV1ACdWRANKINRx?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1C5tbAyhMgSrDq-miEMfDweRmfZtrjmyd?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1GKpXGfAqzr9bsYqVaoXJj0WJijZxhWSe?usp=drive_link");
                }
            }
        });

        // for semester 5
        arrsem5.add("Direct Tax - I");
        arrsem5.add("Fundamentals of Entrepreneurial Marketing");
        arrsem5.add("Marketing in Digital Age");
        arrsem5.add("Business Strategy");
        arrsem5.add("Financial Markets and Services");
        arrsem5.add("Investment Analysis and Portfolio Management");
        arrsem5.add("Understanding Organization Change and Development");
        arrsem5.add("Fundamentals of Training and Development");
        arrsem5.add("Service Marketing");
        arrsem5.add("Supply Chain Management");
        arrsem5.add("Summer Internship");


        ArrayAdapter<String> adpsem5=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem5);
        sem5.setAdapter(adpsem5);

        btnsem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1xMhcMa4nz-Gwekim6W00RXXMhOuP9NRZ?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1XyCt_uuGb6CFYXe5fizvj7-czksdIvO-?usp=drive_link");
                }else if(position==2){
                    goToUrl("https://drive.google.com/drive/folders/1OtqcaVwIoKM7FpHS3nKttEvyOGjvTCWq?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1k_wnTSR_o7AGFy8QHjfr5h1O6TadDaW_?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1tdbtUmG2B44bNcBaPFIZnUKZa5TkSUaC?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1vel8uGjgSv9QwPCNt-yuHJTr3tAmxTED?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1qQGMqZi7f0m04_PEc-YQZCuhKxdkupTC?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1_7AG2q_a09Bnk4iyDSU1yQbIkLcTaeDe?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1duLuxoMQSWI-RIQMk7lKeafR9K4kdXFG?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1X302UINB47Ud-_l2IAZp6RSr_EUorYax?usp=drive_link");
                }else if (position==10){
                    goToUrl("https://drive.google.com/drive/folders/1D8HpNdKKV8AymQL-Ilyk_UMaZlqYucbN?usp=drive_link");
                }
            }
        });

        // for semester 6
        arrsem6.add("Social Communication");
        arrsem6.add("Direct Tax - II");
        arrsem6.add("Understanding Leadership and Motivation in Organization");
        arrsem6.add("Sales and Distribution Management");
        arrsem6.add("Human Values and Community Outreach");
        arrsem6.add("Fundamentals of Competitive Intelligence and Business Development");
        arrsem6.add("Advance Corporate Finance");
        arrsem6.add("Risk Management - BSI");
        arrsem6.add("Fundamentals of International Human Resource Management");
        arrsem6.add("Understanding Industrial Relations and Labour Laws");
        arrsem6.add("Brand Management");
        arrsem6.add("Fundamentals of Retailing");
        arrsem6.add("Dissertation");


        ArrayAdapter<String> adpsem6=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem6);
        sem6.setAdapter(adpsem6);

        btnsem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem6.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/143n4pEkoiF7aCjWR28rrBSGlXG6g1k8y?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1406JveIAi9Az0YL-hY-X6IwHemisjR76?usp=drive_link");
                }else if(position==2){
                    goToUrl("https://drive.google.com/drive/folders/1PcWfYE-nK33h_r-Rs1L0BK7gLRTu2vNr?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1S8gKwv1K3iTwfK3nCsCs8bf5ipLcur5f?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1YEsvdeJ02oPm8UEREfiq6VjEtLYUiFJ8?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1YGeA7o35p72irYH7GTjLzg4hu7Km6Ctr?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1D4UgjAubbLWuOUz336ANX68VyQBO3IFt?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/116pIO9tKQqHmoZk7G8CQpR2kdflzSAiQ?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1jT1stjG4KpgHIKbBL7IEHPV5kSTgRkQQ?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1YL72gX_NEY8o0NloLkt1-Ocq6zOIXIs1?usp=drive_link");
                }else if (position==10){
                    goToUrl("https://drive.google.com/drive/folders/1AiSlVy16csD3wbFZL5F2tNabi4l-QnDc?usp=drive_link");
                }else if (position==11){
                    goToUrl("https://drive.google.com/drive/folders/1S7hR53yU3AWdT9MlbmnaTYyRNqANevi8?usp=drive_link");
                }else if (position==12){
                    goToUrl("https://drive.google.com/drive/folders/1Oe-miWMvSo0F5pFqX9O0nfNA13mSyOfP?usp=drive_link");
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
        Uri u= Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,u);
        startActivity(intent);
    }
}