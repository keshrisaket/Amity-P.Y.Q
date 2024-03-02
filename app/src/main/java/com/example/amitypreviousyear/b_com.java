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

public class b_com extends AppCompatActivity {

    Toolbar toolbar;

    Spinner sem1,sem2,sem3,sem4,sem5,sem6;

    AppCompatButton btn_sem1,btn_sem2,btn_sem3,btn_sem4,btn_sem5,btn_sem6;

    ArrayList<String> arrSem1=new ArrayList<>();
    ArrayList<String> arrSem2=new ArrayList<>();
    ArrayList<String> arrSem3=new ArrayList<>();
    ArrayList<String> arrsem4=new ArrayList<>();
    ArrayList<String> arrsem5=new ArrayList<>();
    ArrayList<String> arrsem6=new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcom);

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

        arrSem1.add("Financial Accounting - I");
        arrSem1.add("Micro Economics");
        arrSem1.add("Business Mathematics I");
        arrSem1.add("Mercantile Law");
        arrSem1.add("Management Foundation");
        arrSem1.add("Environmental Studies - I");
        arrSem1.add("Financial Services");
        arrSem1.add("Communication Skills - I");


        ArrayAdapter<String> adp_sem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrSem1);
        sem1.setAdapter(adp_sem1);

       btn_sem1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int position=sem1.getSelectedItemPosition();
               if(position==0){
                   goToUrl("https://drive.google.com/drive/folders/1XXHnqb1jPQq5BRQopQo4Yowwe4q9Vc7o?usp=drive_link");
               } else if (position==1) {
                   goToUrl("https://drive.google.com/drive/folders/17ClaUnLhSH0ZQMnjfzzs4drgGYUDU61S?usp=drive_link");
               } else if (position==2) {
                   goToUrl("https://drive.google.com/drive/folders/1FQgioH_qmXLicwWqnYusHfhaLUMaKYg0?usp=drive_link");
               } else if (position==3) {
                   goToUrl("https://drive.google.com/drive/folders/16cdfWJVY8ewQ5fnwWZvvcKTPjOfxSrRl?usp=drive_link");
               } else if (position==4) {
                   goToUrl("https://drive.google.com/drive/folders/1afz-6B3zDpI5H0O03N8-ic_fUv5BCwWK?usp=drive_link");
               } else if (position==5) {
                   goToUrl("https://drive.google.com/drive/folders/1Q_h8Jp9-049ce479zIWxA0ILQvSIez1p?usp=drive_link");
               }else if (position==6){
                   goToUrl("https://drive.google.com/drive/folders/1t7VaMI3DElKca9o_H7dYUbGPTwoMssS3?usp=drive_link");
               }else if (position==7){
                   goToUrl("https://drive.google.com/drive/folders/1wwtUngFAWw86gLiGOf9eZxlyE8R0E-qY?usp=drive_link");
               }
           }
       });


       // for semester 2

        arrSem2.add("Financial Accounting - II");
        arrSem2.add("E - Commerce");
        arrSem2.add("Macroeconomics");
        arrSem2.add("Environmental Studies - II");
        arrSem2.add("Fundamentals of Corporate Law");
        arrSem2.add("Principles of Marketing");
        arrSem2.add("Business Mathematics II");
        arrSem2.add("Term Paper");
        arrSem2.add("Communication Skills - II");


        ArrayAdapter<String> adp_sem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrSem2);
        sem2.setAdapter(adp_sem2);

        btn_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1LNxC_5plhB8msPlx8Wzz-7p80VMK8Zje?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1xtsGYoP-BkjRQWOjUE2hjlYC1w0Zgti-?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1WrniibBZjr-EmQXmTVGnodlIO40aZN37?usp=drive_link");
                }else if(position==3){
                    goToUrl("https://drive.google.com/drive/folders/1FjJuy1PqZ99lrIscHIg0y8zo063w3mwb?usp=drive_link");
                } else if (position==4) {
                    goToUrl("https://drive.google.com/drive/folders/1iDfV_Qp7HSIiF8ViEKLyJtwNL_Nd6E2r?usp=drive_link");
                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/1qPVvTkV1h-7MApV4B_sMnlPUjLCgre6O?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1Z4swp1xI0aEA01kp_RAV8ahX_7ebFSWD?usp=drive_link");
                } else if (position==7) {
                    goToUrl("https://drive.google.com/drive/folders/10507MPRTZ31kh9BrsAKly1KJMB0ISaWM?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1I49z4fGdZ7NaqqoFTS31EZviL-ShPji0?usp=drive_link");
                }
            }
        });

        // for semester 3

        arrSem3.add("Corporate Accounting - I");
        arrSem3.add("Direct Tax - I");
        arrSem3.add("Auditing");
        arrSem3.add("Fundamentals of Financial Management");
        arrSem3.add("Fundamentals of Human Resource Management");
        arrSem3.add("Business Statistics");
        arrSem3.add("Fundamentals of Entrepreneurship");
        arrSem3.add("Minor Project");
        arrSem3.add("Individual Excellence & Social Dynamics");


        ArrayAdapter<String> adp_sem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrSem3);
        sem3.setAdapter(adp_sem3);

        btn_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if(position==0){
                    goToUrl("https://drive.google.com/drive/folders/18jC1GB6mj9jj1L1iK54qawlsi7hJyHrv?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/1NJ8wbLqjGuoy0WKq5Qir47lgs6lk8wKz?usp=drive_link");

                } else if (position==2) {
                   goToUrl("https://drive.google.com/drive/folders/1oh091S44GmKDBI1xPxgURglCF0BYLK3D?usp=drive_link");
                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/105bZCmp7jPZ1hryjMuZ5tdfUc2SEtJ6e?usp=drive_link");
                } else if (position==4) {
                    goToUrl("https://drive.google.com/drive/folders/1T1amPexMUDhnx_ZccVPJpAsT9LLI_7QN?usp=drive_link");

                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/1fawiB9DIi2ZG95epw2pVCjOcjNZQHPDA?usp=drive_link");

                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1tWk3V1O9SpZRpXLKEj8wiL4bBNRqGciT?usp=drive_link");

                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1D1ctPg8J3CUc9CZ3scyM0gN9K1TpKc_b?usp=drive_link");

                } else if (position==8) {
                    goToUrl("https://drive.google.com/drive/folders/1V3DB-Z_DHk5lV2Sz4btdwIm1UR3x0TeR?usp=drive_link");

                }
            }
        });


        // fro semester 4

        arrsem4.add("Direct Tax - II");
        arrsem4.add("Corporate Accounting - II");
        arrsem4.add("Management Accounting");
        arrsem4.add("Understanding International Business Management");
        arrsem4.add("Research Methodology");
        arrsem4.add("Principles of Consumer Behaviour");
        arrsem4.add("Summer Internship");
        arrsem4.add("Creativity for Team Excellence");

        ArrayAdapter<String> adp_sem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem4);
        sem4.setAdapter(adp_sem4);


        btn_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1_Vhp-Qa2PQfwIkIcOmDXfJL-y-mAjdjp?usp=drive_link");
                }else if(position==1){
                    goToUrl("https://drive.google.com/drive/folders/1WFaD4ui4VQC97ju_83N4bRyHq7uWpaVp?usp=drive_link");
                } else if (position==2) {
                    goToUrl("https://drive.google.com/drive/folders/19GnmfejJdA-SUKF9aKsdcRcGLlt9PlJq?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1F_h21VXljiamqid9Bqr0vYxJ0Mt2AWl1?usp=drive_link");
                } else if (position==4) {
                    goToUrl("https://drive.google.com/drive/folders/1PrOOwrAJ2LeX9cfBJ9V4rUu9qiC4JHuX?usp=drive_link");
                }else if(position==5){
                    goToUrl("https://drive.google.com/drive/folders/1ujU_ZoC-uh8IsaFhhNhi9Eo9CotWzy8x?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1pKg3HYLTArm7PZmebtukKDJbel1SgBWX?usp=drive_link");
                }else if(position==7){
                    goToUrl("https://drive.google.com/drive/folders/14RWo_Gnzl5Xrje_ApMXx-ofasccB3H7w?usp=drive_link");

                }
            }
        });


        // for semester 5

        arrsem5.add("Indian Economy");
        arrsem5.add("Security Analysis");
        arrsem5.add("Fundamentals of Production and Operations Management");
        arrsem5.add("Business Policy and Strategic Management");
        arrsem5.add("Management Accounting");
        arrsem5.add("Principles of Consumer Behaviour");
        arrsem5.add("Micro Finance");
        arrsem5.add("Financial Reporting");
        arrsem5.add("Fundamentals of Training and Development");
        arrsem5.add("Seminar - I");
        arrsem5.add("Professional Communication for Recruitment and Employability");


        ArrayAdapter<String> adp_sem5=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem5);
        sem5.setAdapter(adp_sem5);


        btn_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0) {
                    goToUrl("https://drive.google.com/drive/folders/1ipFmg7Merrmzyna5VenXyobgGTedHkxD?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/126N0RRD-EmFNP7GvdQHS7KZlQw6gOOog?usp=drive_link");
                }else if(position==2){
                    goToUrl("https://drive.google.com/drive/folders/1X7gfhPqFf8867Zhw5PnxF5fSuGuG8rvC?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/13gv-gR56MUWuSxfjFTVL2oB8JectGle3?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1EKPebTFr7R4o7aP8Z0CXK2FD123k_Qt5?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1WJGsgWtJJyBs8jsaothumatGHABeGERo?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1-_Ux_Ca7O6LQpR-LzEK9S6h-txi5uhNg?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/11iWpkyw0eqa9UzbQdtT1l-y5W9WZVhrn?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1laMMpOhh3CDeyuEWpw4rJhFuv7PrORI2?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1iCrPndw7d0wE7VXOPJ1QoTsDT2qN1xpc?usp=drive_link");
                }else if (position==10){
                    goToUrl("https://drive.google.com/drive/folders/1g65G4VLHbcSW0vkXoHG62D621m5cRsWb?usp=drive_link");
                }
            }
        });


        // for semester 6

        arrsem6.add("International Economics");
        arrsem6.add("Fundamentals of Behavioural Finance");
        arrsem6.add("Portfolio Management");
        arrsem6.add("Corporate Tax Planning");
        arrsem6.add("Sales and Distribution Management");
        arrsem6.add("Major Project");
        arrsem6.add("Risk Management - BSI");
        arrsem6.add("Human Values and Community Outreach");
        arrsem6.add("Operations Research");
        arrsem6.add("Stress and Coping Strategies");

        ArrayAdapter<String> adp_sem6=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem6);
        sem6.setAdapter(adp_sem6);

        btn_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem6.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1y-vemitTmPOZK7AUFL1n4ZBjVqcD4o4w?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1QmVgbe4I4sEgeY_ZCc_i3ivGWNJys8Kk?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1ffJtoNK-1O8jUcikaIaeuc4Qlql7LEZY?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1adAzB22azpkiS7YvaiH8UcnfAvVuwzl6?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1chQA6j-9LK8Z72A52CigR5jO-F7Ztv7s?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1dAYU3KDRQ46GaqzML5fImxftNxO5RZtH?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1sw1VZMQj66aIRYVI0BikTcVPiUXDMQ-u?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1XAmjkTaheLWLHQWvBXCcDHNBPUz7THv3?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1VvT1mo-vsSsZwe4vAxkCSyUMuUONFG0o?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1_6p3uJFZqrRWXsFNUZyFJ0yiOvJcK14c?usp=drive_link");
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