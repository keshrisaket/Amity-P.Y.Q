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

public class b_tec_computer extends AppCompatActivity {

    Toolbar toolbar;
    Spinner sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;

    ArrayList<String> arrsem1=new ArrayList<>();
    ArrayList<String> arrsem2=new ArrayList<>();
    ArrayList<String> arrsem3=new ArrayList<>();
    ArrayList<String> arrsem4=new ArrayList<>();
    ArrayList<String> arrsem5=new ArrayList<>();
    ArrayList<String> arrsem6=new ArrayList<>();
    ArrayList<String> arrsem7=new ArrayList<>();
    ArrayList<String> arrsem8=new ArrayList<>();



      AppCompatButton btn_sem1,btn_sem2,btn_sem3,btn_sem4,btn_sem5,btn_sem6,btn_sem7,btn_sem8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btec);

        sem1=findViewById(R.id.sem1);
        sem2=findViewById(R.id.sem2);
        sem3=findViewById(R.id.sem3);
        sem4=findViewById(R.id.sem4);
        sem5=findViewById(R.id.sem5);
        sem6=findViewById(R.id.sem6);
        sem7=findViewById(R.id.sem7);
        sem8=findViewById(R.id.sem8);


        btn_sem1=findViewById(R.id.btn_sem1);
        btn_sem2=findViewById(R.id.btn_sem2);
        btn_sem3=findViewById(R.id.btn_sem3);
        btn_sem4=findViewById(R.id.btn_sem4);
        btn_sem5=findViewById(R.id.btn_sem5);
        btn_sem6=findViewById(R.id.btn_sem6);
        btn_sem7=findViewById(R.id.btn_sem7);
        btn_sem8=findViewById(R.id.btn_sem8);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

        // for semester 1

        arrsem1.add("Applied Mathematics- I");
        arrsem1.add("Engineering Physics");
        arrsem1.add("Law for Engineers");
        arrsem1.add("Environmental Studies - I");
        arrsem1.add("Engineering Mechanics");
        arrsem1.add("Workshop Practices");
        arrsem1.add("Introduction to Computers and Programming in C");
        arrsem1.add("Technical Communication – I");


        ArrayAdapter<String> adp_sem1=new ArrayAdapter<>(getApplication(),android.R.layout.simple_spinner_dropdown_item,arrsem1);
        sem1.setAdapter(adp_sem1);


        btn_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1MdbfuQkQPvAb4AOXuPiC-TRKf_JuMrdS?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1h30wnaqZ5wDquNrw9ZX8gb7XyZVUKVK9?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1jo5wIKv57ZtpN27jnxi_UZtnklpscPb5?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1W1dmeeE0QX_ncOH7yFzi6y_eTr-V2ZR7?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/16zpX749LTKWgowEV2o3P0BUfmCw__o80?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/10zyMatWo0EhVNojFIVk459Dm9G1BOQa2?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1ZNVeFl3sxd3GT5VkoshxkukV5BiXpbA3?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1-cYT3DcNt9MFvCsMIZLD_tSOqQANhl8h?usp=drive_link");
                }
            }
        });




        // for semester 2
        arrsem2.add("Engineering Chemistry");
        arrsem2.add("Applied Mathematics - II");
        arrsem2.add("Basic Electrical Engineering");
        arrsem2.add("Economics for Engineers");
        arrsem2.add("Aspects of Indian History for Engineers");
        arrsem2.add("Introduction to Environmental Studies");
        arrsem2.add("Engineering Graphics Lab");
        arrsem2.add("Technical Communication – II");

        ArrayAdapter<String> asp_sem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem2);
        sem2.setAdapter(asp_sem2);




        btn_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem2.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/17op84Jxb03fVMnSmDE2WPesoB2eYQnbe?usp=drive_link");
                } else if (position == 1) {
                    goToUrl("https://drive.google.com/drive/folders/1raUEjf101j84_u7pnLuG5uOYIFzEAp3L?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/1xBwHvqungVRoCnaU093W-vbL8PIopxCm?usp=drive_link");
                } else if (position == 3) {
                    goToUrl("https://drive.google.com/drive/folders/1k6Dqp0duYBwv9jkNhRfUH9fxkBPcPXzA?usp=drive_link");
                } else if (position == 4) {
                    goToUrl("https://drive.google.com/drive/folders/15i8Kkn-19k1tYa8yFvQVWEJoPHp6QbbK?usp=drive_link");
                } else if (position == 5) {
                    goToUrl("https://drive.google.com/drive/folders/1ZhsFdcxBAyxKOq7KlBgM9Qpl4NIAguIQ?usp=drive_link");
                } else if (position == 6) {
                    goToUrl("https://drive.google.com/drive/folders/1ZIR86-7GKdvGqceYDCDYxrqzTXIM5D-p?usp=drive_link");
                } else if (position == 7) {
                    goToUrl("https://drive.google.com/drive/folders/1wFdtjYC5ZhGYNf459ecysb3OMKCSQF3m?usp=drive_link");
                }
            }


        });



        // fro semester 3

        arrsem3.add("Applied Mathematics- III");
        arrsem3.add("Digital Electronics and Computer Organization");
        arrsem3.add("Data Structures Using C");
        arrsem3.add("Object Oriented Programming Using C++");
        arrsem3.add("Introduction to AI and ML");
        arrsem3.add("Term Paper");

        ArrayAdapter<String> adp_sem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem3);
        sem3.setAdapter(adp_sem3);



        btn_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem3.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/12ZEpR52SudlN7laORIa4o0w0vQgaXqqZ?usp=drive_link");
                } else if (position == 1) {
                    goToUrl("https://drive.google.com/drive/folders/17YkkRRCB1KEM19XUTu0wYN7z9Iu-qu8W?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/1GffoSMNWGBU-zO-wThgi4vk8fspTJZs6?usp=drive_link");
                } else if (position == 3) {
                    goToUrl("https://drive.google.com/drive/folders/1kEvcqRcSMzbYjNW90PtKgTtcNlLLZwyQ?usp=drive_link");
                } else if (position == 4) {
                    goToUrl("https://drive.google.com/drive/folders/1pNoCKSZXCFwK3NeB_vwZ7xNWDhL9wwWZ?usp=drive_link");
                } else if (position == 5) {
                    goToUrl("https://drive.google.com/drive/folders/1rmySNBVDFIC8-sWifDjsT3n8YgIKSjV9?usp=drive_link");
                }
            }


        });


        // for semester 4
        arrsem4.add("Applied Mathematics-IV");
        arrsem4.add("Operating System");
        arrsem4.add("Theory of Computation");
        arrsem4.add("Java Programming");
        arrsem4.add("Basic Simulation Lab");
        arrsem4.add("Discrete Mathematical Structures");
        arrsem4.add("Self-Reliance and Socialization");




        ArrayAdapter<String> adp_sem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem4);
        sem4.setAdapter(adp_sem4);



        btn_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem4.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/1kbMx-bgcjquY12P1PYebBUTwka_K74My?usp=drive_link");
                } else if (position == 1) {
                    goToUrl("https://drive.google.com/drive/folders/1azX4yRAuxr6qqQxssSJ1aQIn2Nh4WDyM?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/1xOMKA8yZTaJGDCYr5oN9b4nAag0Ao4Us?usp=drive_link");
                } else if (position == 3) {
                    goToUrl("https://drive.google.com/drive/folders/18J1wwz5rb4LAkneZvCcWQRmtn-bQnd4m?usp=drive_link");
                } else if (position == 4) {
                    goToUrl("https://drive.google.com/drive/folders/19yL40MiDkAcCRxvFXEWcVjjbjF8kGnxl?usp=drive_link");
                } else if (position == 5) {
                    goToUrl("https://drive.google.com/drive/folders/1sqUK-ezhp-ovH5NL4lCY_H-_h4aPu4pm?usp=drive_link");
                }else if(position==6){
                    goToUrl("https://drive.google.com/drive/folders/1k6OgAD6QsZX8QpdVNH1cWQMbWN3KqaPK?usp=drive_link");
                }
            }


        });


        // fro semester 5
        arrsem5.add("Database Management Systems");
        arrsem5.add("Analysis and Design of Algorithms");
        arrsem5.add("Exploring the Networks");
        arrsem5.add("Aptitude and Reasoning Ability");
        arrsem5.add("Fundamentals of Mobile Computing");
        arrsem5.add("In-House Practical Training");
        arrsem5.add("Cognitive Skills, Leadership and Decision Making");


        ArrayAdapter<String> adp_sem5=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem5);
        sem5.setAdapter(adp_sem5);



        btn_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem5.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/1iuEeQgpH5iL68LLYzn291TPUrnwSy4WY?usp=drive_link");
                } else if (position == 1) {
                    goToUrl("https://drive.google.com/drive/folders/1FNnaUi-h8yzZFuF0HZQTTCdzRionILoV?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/1UbqDw4il0ITjp2fAO2xun-2YYu6X8JV3?usp=drive_link");
                } else if (position == 3) {
                    goToUrl("https://drive.google.com/drive/folders/1GwakG-FHFnnfuic_7Kx27EaXOX39J_S2?usp=drive_link");
                } else if (position == 4) {
                    goToUrl("https://drive.google.com/drive/folders/1rL-Wlg_Zb7PyhcYB0Xv8GQ-LTh95iyb1?usp=drive_link");
                } else if (position == 5) {
                    goToUrl("https://drive.google.com/drive/folders/1WO9oX0wK3PP79VnIuGt3XvyZ2-vFPr0K?usp=drive_link");
                }else if(position==6){
                    goToUrl("https://drive.google.com/drive/folders/1UKW9TfCMgrdYMEj6tHMNMKZSRA1COIy2?usp=drive_link");
                }
            }


        });


        // fro semester 6
        arrsem6.add("Compiler Construction");
        arrsem6.add("Artificial Intelligence");
        arrsem6.add("Software Engineering");
        arrsem6.add("Programming & Employability Skills for Computer Engineers");
        arrsem6.add("Distributed System");
        arrsem6.add("Database Security and Access Control");
        arrsem6.add("Professional Ethics and Social Responsibility");




        ArrayAdapter<String> adp_sem6=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem6);
        sem6.setAdapter(adp_sem6);



        btn_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem6.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/19CwERhNm6Wk_nvXgz_36AKGCblCDv_cW?usp=drive_link");
                } else if (position == 1) {
                    goToUrl("https://drive.google.com/drive/folders/17cG8JWPTFmHFVsWcZ9P2w36sD2HR0uPn?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/1MSinKlKX9P_Bv2nX91qPq8YPEyqAVKW-?usp=drive_link");
                } else if (position == 3) {
                    goToUrl("https://drive.google.com/drive/folders/1WVbezHnhxv80KWBolvLfhTiqBauJhZ5U?usp=drive_link");
                } else if (position == 4) {
                    goToUrl("https://drive.google.com/drive/folders/13LBIM0bkfgchPffKluekdMt2XT4KPaad?usp=drive_link");
                } else if (position == 5) {
                    goToUrl("https://drive.google.com/drive/folders/13qNRwsUv5_xwkXSlLSwVaTnSWT_rly4u?usp=drive_link");
                }else if(position==6){
                    goToUrl("https://drive.google.com/drive/folders/1ZUzVot8J33XAGs41XUaLHSkvTB2tBpaK?usp=drive_link");
                }
            }


        });


        // for semester 7
        arrsem7.add("Introduction to Statistical Tools in Research");
        arrsem7.add("Introduction to Deep Learning");
        arrsem7.add("Introduction to Natural Language Processing");
        arrsem7.add("Data Mining and Business Intelligence");
        arrsem7.add("Industry Internship");
        arrsem7.add("Software Testing and Quality Assurance");
        arrsem7.add("Minor Project");


        ArrayAdapter<String> adp_sem7=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem7);
        sem7.setAdapter(adp_sem7);



        btn_sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem7.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/1FxZiXNpV3emaCvC4WxkVW_SFIVsadO1S?usp=drive_link");
                } else if (position == 1) {
                    goToUrl("https://drive.google.com/drive/folders/1edu5N77U4UA7gBJ3uKrgyY7hcRUcdFVH?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/1GpF_XfgcaNcF5JzT3ckLzGG6LPwPP8mL?usp=drive_link");
                } else if (position == 3) {
                    goToUrl("https://drive.google.com/drive/folders/1ILRVSXMGXnk-_99qG3NlXZTtWx5uKMHh?usp=drive_link");
                } else if (position == 4) {
                    goToUrl("https://drive.google.com/drive/folders/1cvMWP1cNBGwffTeKV-eUio3VJjhWcGwn?usp=drive_link");
                } else if (position == 5) {
                    goToUrl("https://drive.google.com/drive/folders/1bP1zpPnKH_XHL3TCCNlwJrKHQkZOJil4?usp=drive_link");
                }else if(position==6){
                    goToUrl("https://drive.google.com/drive/folders/1BXgE9dDPCOiLCyNuVHwOLeLvk4bIhLLV?usp=drive_link");
                }
            }


        });


        // for semester 8
        arrsem8.add("Major Project");


        ArrayAdapter<String> adp_sem8=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem8);
        sem8.setAdapter(adp_sem8);



        btn_sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem8.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/1EBiHJC8PeXyFlnDVH8vbJRY1ntznMR6X?usp=drive_link");
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