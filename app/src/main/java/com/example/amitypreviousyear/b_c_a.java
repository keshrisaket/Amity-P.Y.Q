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

public class b_c_a extends AppCompatActivity {

    Toolbar toolbar;


    Spinner sem1,sem2,sem3,sem4,sem5,sem6;

    AppCompatButton btn_sem1,btn_sem2,btn_sem3,btn_sem4,btn_sem5,btn_sem6;

    ArrayList<String> sem1arr=new ArrayList<>();
    ArrayList<String> sem2arr=new ArrayList<>();
    ArrayList<String> sem3arr=new ArrayList<>();
    ArrayList<String> sem4arr=new ArrayList<>();
    ArrayList<String> sem5arr=new ArrayList<>();
    ArrayList<String> sem6arr=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc);

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



        // fro semester 1

        sem1arr.add("Software Engineering- I");
        sem1arr.add("Computer and Information Technology");
        sem1arr.add("Programming in C");
        sem1arr.add("Environmental Studies - I");
        sem1arr.add("Basic Mathematics- I");
        sem1arr.add("Communication Skills - I");


        ArrayAdapter<String> adp_sem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem1arr);
        sem1.setAdapter(adp_sem1);

        btn_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1sAR8xT7DiCKLdzoK2ITHgbGNs4F2flmh?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/1tIV2EhQg364LR8h9DKDgke_gaROeFUnT?usp=drive_link");

                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1i07LnCOF29lz92rvp9Js7KC7FWPqSjmV?usp=drive_link");
                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/16ER9qSLzRutD6Quvsnv4tpvCCIx9J80t?usp=drive_link");

                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1lbdg_Ic0jwOpcLC0abp297ER14JNTC_j?usp=drive_link");

                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/1WoBr1h-b6yDPXvPPSVSzUwd0sUe2aGC1?usp=drive_link");

                }
            }
        });





        // for semester 2

        sem2arr.add("Operating System");
        sem2arr.add("Data Structures Using C");
        sem2arr.add("Digital Circuit Design");
        sem2arr.add("Fundamentals of E-commerce");
        sem2arr.add("Communication Skills - II");


        ArrayAdapter<String> adp_sem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem2arr);
        sem2.setAdapter(adp_sem2);

        btn_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1Z8jNpsZvfKhTk3f59_96rQS4ezpUz6GN?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/1k9-11nmitJlvgzbKXgvfHfDWVQREwgKv?usp=drive_link");

                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1HaretVxWEhWcJKoXv4IZ4OAeGuEnirra?usp=drive_link");
                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/1X237sZoWOxNyF09Vsj-ATskA-o48NCV6?usp=drive_link");

                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1HchMsKyj7x92kQokdjd5wCiiq-kztdyL?usp=drive_link");

                }
            }
        });





        // for semester 3

        sem3arr.add("Introduction to Data Base Management Systems");
        sem3arr.add("Elementary Algorithms");
        sem3arr.add("Unix Operating System and Shell Programming");
        sem3arr.add("Object Oriented Programming Using C++");
        sem3arr.add("Cyber and Information Security");
        sem3arr.add("Term Paper");
        sem3arr.add("Individual Excellence & Social Dynamics");


        ArrayAdapter<String> adp_sem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem3arr);
        sem3.setAdapter(adp_sem3);

        btn_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1iMOnyxRQhxHj56YCqa1iQ3XUcpmFMYwX?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/1yv2-BYci5TZuST3OfzBqG5ptmG13dqY2?usp=drive_link");

                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/11C-HuasMbtItxnz83yvztdRUCPvntLrS?usp=drive_link");
                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/1S69SPrsjqZVVdpfgQT_YPqvvDyY27wfT?usp=drive_link");

                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1aA0GxxqgGs2bQaPSd9Xv92uOkzMhVy26?usp=drive_link");

                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/1YM68MFDliPDvQ-5AVHO_xNu-3hZb2TOy?usp=drive_link");

                } else if (position==6) {
                    goToUrl("https://drive.google.com/drive/folders/1Kewdw-FoeUPx5zmMQvbuvH3StrWRAkPq?usp=drive_link");
                }
            }
        });




        // fro semester 4

        sem4arr.add("Working At a Small-to-medium Business Or Isps");
        sem4arr.add("Introductions to Data Science");
        sem4arr.add("Accounting Fundamentals");
        sem4arr.add("Web Technologies and Applications");
        sem4arr.add("Introduction to Artificial Intelligence");
        sem4arr.add("Innovation by Design");
        sem4arr.add("Creativity for Team Excellence");


        ArrayAdapter<String> adp_sem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem4arr);
        sem4.setAdapter(adp_sem4);

        btn_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1vjgJiIznva7unu2X2gfKOAh1UI7bt6Rr?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/1pu1fAgfS4MBYakQsQDa0lI0URzgBjafO?usp=drive_link");

                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1s8WPIA2RujQ9akjT7JZg08ItgifcUGEo?usp=drive_link");
                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/1B6QmGOj82WF64uDzxQMk5PHy93oRz4-H?usp=drive_link");

                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1u9d9nw-BOQTkHGNnRkwwgdGhKOZeGLem?usp=drive_link");

                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/1JH-xijIRXPGOs8yBV8QWbQ9PGD2MWliN?usp=drive_link");

                } else if (position==6) {
                    goToUrl("https://drive.google.com/drive/folders/1uc7XAT22S3JemWVNGgpeI5DJ_17WkHpu?usp=drive_link");
                }
            }
        });





        // for semester 5

        sem5arr.add("Android Programming and Web Applications for Mobile Devices");
        sem5arr.add("Internet of Things");
        sem5arr.add("Core Java");
        sem5arr.add("Human Computer Interaction");
        sem5arr.add("Data Warehousing and Mining");
        sem5arr.add("Summer Internship - I");
        sem5arr.add("UI/UX Design for Entrepreneurs");


        ArrayAdapter<String> adp_sem5=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem5arr);
        sem5.setAdapter(adp_sem5);

        btn_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/16-bNC-SvNsPEGQ4tiEw8HgKR6Z-gzUNM?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/16aJ2qhMvO_qLhpemoNE9K9grsBfG-S5w?usp=drive_link");

                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1NhhwE_CAbz8cFQAATXcCsIS9nOOydO2Z?usp=drive_link");
                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/1Bs4FOGOSWP5HwgYXboTxGkIFMsl7nIp_?usp=drive_link");

                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1ADn4TrdD-fMCEQWxjxgUjLCbBKbusvkA?usp=drive_link");

                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/1X0PYp4OsrdZlH3Cs6LbarSMxkaHJz2cc?usp=drive_link");

                } else if (position==6) {
                    goToUrl("https://drive.google.com/drive/folders/1pSfAsKM_znMpU9HIfKQw6GHI5eg-9jnp?usp=drive_link");
                }
            }
        });





        // for semester 6
        sem6arr.add("Advanced Java");
        sem6arr.add("Blockchain Technologies");
        sem6arr.add("Introduction to Open Source Technologies-php,Mysql");
        sem6arr.add("Social Communication");
        sem6arr.add("Stress and Coping Strategies");
        sem6arr.add("Major Project");


        ArrayAdapter<String> adp_sem6=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem6arr);
        sem6.setAdapter(adp_sem6);

        btn_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem6.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1DKZFGB0eJf-w2QLm5eq_XU4OOCWTZp2u?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/1z63Ox1N0nJahpTfZU7ui9QQuUJd5ljA5?usp=drive_link");

                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1HRTOQ2N7YnrV-gksTdSZAu4bg72raxEZ?usp=drive_link");
                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/17XrnyOPM1ALF7Q7Eqr9nJw7DM1l5QH65?usp=drive_link");

                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1Ci-cQmYBG0UL7fCJN3qRWsNQegiamQ0o?usp=drive_link");

                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/1KDYsfqAtiPchT-D1G0Vs4Eik3AmJtKGh?usp=drive_link");

                }
            }
        });











    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    void goToUrl(String s){
        Uri u=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,u);
        startActivity(intent);
    }
}