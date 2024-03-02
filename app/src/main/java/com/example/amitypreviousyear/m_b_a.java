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

public class m_b_a extends AppCompatActivity {

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
        setContentView(R.layout.activity_mb);


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
        sem1arr.add("Accounting for Managers");
        sem1arr.add("Applications of Disruptive Technologies in Business");
        sem1arr.add("Organizational Behavior");
        sem1arr.add("International Business and Practice");
        sem1arr.add("Marketing Management");
        sem1arr.add("Statistics for Management");
        sem1arr.add("Managerial Economics");
        sem1arr.add("Professional & Business Communication");


        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem1arr);
        sem1.setAdapter(adpsem1);

        but_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/13vw2crmjiIRQ-K-VtLUU8djXQou7oFar?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1m9uoqgezko5Z9R73SEfu1rVoVlRAJrQr?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/10EEGQm21ppclyLv4u4Q4Qn5njjzuzFxH?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/17Di-jv1kk3q1MhdMfj3xRPLeOVDl7qMg?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1z0BoprIZIdEHqOPrWRtxFewhXdEoNLde?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1dCuIQMzEqgs7ybNVCWZDI64U1imN5WXz?usp=drive_link");
                } else if (position == 6) {
                    goToUrl("https://drive.google.com/drive/folders/1PC-IimlInhwNu6mfxMToN5sGMk63zCGo?usp=drive_link");
                }else if(position==7){
                    goToUrl("https://drive.google.com/drive/folders/1fGw2RXZfyQQxKfoOks7Dq0fLVDDhSDq9?usp=drive_link");
                }
            }
        });

        // for semester 2
        sem2arr.add("Financial Management");
        sem2arr.add("Human Resource Management");
        sem2arr.add("Operations Management");
        sem2arr.add("Business Research Methods");
        sem2arr.add("Consumer Behaviour");
        sem2arr.add("Business Analytics and Modelling");
        sem2arr.add("Decision Science");
        sem2arr.add("Cognitive Analytics & Social Skills for Professional Development");


        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem2arr);
        sem2.setAdapter(adpsem2);

        but_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1__NHMLh3N6CfxlYOU_9Xp4BSxdGHizPb?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1Rz12srCZCehmGTJM2eSplahnA4kJE0Kz?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/12UmIlaWVKfD6EvmI_w-aKV1p9YOgoK_P?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1y62ofkM97M8Ney0apAzpkJYgVitME9F9?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/16EZ_0lDKpSr7CL2-AF-c1z70BqxFg3rk?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/149ZMPrbyL__50u5nx9ElxgN9YIGwQW4o?usp=drive_link");
                } else if (position == 6) {
                    goToUrl("https://drive.google.com/drive/folders/1v6UiVwV2aniLoaa3ZHuq4bPhb0oIMRxv?usp=drive_link");
                }else if(position==7){
                    goToUrl("https://drive.google.com/drive/folders/1dDlxsP19_PlK7N8m99JxiukhdlFX6LMl?usp=drive_link");
                }
            }
        });

        // for semester 3
        sem3arr.add("Strategic Management");
        sem3arr.add("I.T. Project Management");
        sem3arr.add("Project Planning Appraisal and Control");
        sem3arr.add("Security Analysis and Portfolio Management");
        sem3arr.add("Management of Financial Services");
        sem3arr.add("Recruitment Selection and Retention");
        sem3arr.add("Compensation and Reward Management");
        sem3arr.add("Product and Brand Management");
        sem3arr.add("Digital Marketing");
        sem3arr.add("Sales Management");
        sem3arr.add("Predictive Analytics using R");
        sem3arr.add("Data Mining and Data Warehousing");
        sem3arr.add("WORKPLACE PSYCHOLOGY");
        sem3arr.add("Summer Internship");


        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem3arr);
        sem3.setAdapter(adpsem3);

        but_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1hyIjE-3ZGCmMX8gtf6GxSCIwp8op2yRe?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1RBHo_8QwYSF-5WV85nLQtWrWPVj2nGrv?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/1U75oVJ2jOIwMX2j658PUEct73M1tZ377?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1eVV7BI3kEpBG5U6CUfs8Tlvsfr8yKO1g?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1Mo83h0eZpL3Cy9j5v0PKfwJPlY08sn6K?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1wlUe8jCHURRkzwJy7MngzZWRWIiE9SaK?usp=drive_link");
                } else if (position == 6) {
                    goToUrl("https://drive.google.com/drive/folders/1TWUfwkSc3MyZR7rWNm9lGnhhOYPoK5r7?usp=drive_link");
                }else if(position==7){
                    goToUrl("https://drive.google.com/drive/folders/1drt6_6k0GW7GNc3axcKzaI9zaye25Irl?usp=drive_link");
                } else if (position == 8) {
                    goToUrl("https://drive.google.com/drive/folders/11s6Xkh2zlC3_nia5Y-LA4Jyk1YYg5PJi?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1DAsZyW9NH4BhXdbLjWaNiGxb5AIpGTPY?usp=drive_link");
                }else if (position==10){
                    goToUrl("https://drive.google.com/drive/folders/1ayrAjGesotiCB283RpvTLLFGswylvTE-?usp=drive_link");
                }else if (position==11){
                    goToUrl("https://drive.google.com/drive/folders/1W3wowEre1FOuW8rhcklD3YoYh2icC44l?usp=drive_link");
                }else if (position==12){
                    goToUrl("https://drive.google.com/drive/folders/1YG3sT1XIFWfwSA_zK-u7UIQmsI4cn7wT?usp=drive_link");
                }else if (position==13){
                    goToUrl("https://drive.google.com/drive/folders/1uObtnBHAkauq4zxlnQzZIqJtq9X30DCC?usp=drive_link");
                }
            }
        });

        // for semester 4
        sem4arr.add("Management in Action - Social Economic and Ethical Issues");
        sem4arr.add("Enterprise Cloud Computing");
        sem4arr.add("Data Visualization: Tools and Techniques");
        sem4arr.add("Cyber security & Risk Management");
        sem4arr.add("Corporate Restructuring, Mergers and Acquisitions");
        sem4arr.add("Strategic Financial Management");
        sem4arr.add("Training and Development");
        sem4arr.add("Managerial Counselling");
        sem4arr.add("Power, Politics and Leadership");
        sem4arr.add("Advertising and Sales Promotion");
        sem4arr.add("Marketing of Services");
        sem4arr.add("Principles of Retailing");
        sem4arr.add("Dissertation");
        sem4arr.add("Behavioural Finance");


        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem4arr);
        sem4.setAdapter(adpsem4);

        but_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1B2SE0LlnYjiBMcsqbjEuA4UMtZ6cC1Wk?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1R5Ym_D9RW8vchka4RECTT-K9eSx1Ykto?usp=drive_link");
                } else if (position == 2) {
                    goToUrl("https://drive.google.com/drive/folders/1HwBrwKDUbnZQqstKSSMJdrQbXiaFupRC?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1wgXM-vulURy0T6PiFc0yb9b1ok3u5g7I?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1eNVXDTCdreXoS7N1IhtpVDZpY5uWRNgU?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1zRGHnBNGk6QQ1_p7LqYhTd_pqn5pr7uZ?usp=drive_link");
                } else if (position == 6) {
                    goToUrl("https://drive.google.com/drive/folders/1zhEPy8OzpwmntkVQci2zIet3WFI5IhXr?usp=drive_link");
                }else if(position==7){
                    goToUrl("https://drive.google.com/drive/folders/1N64jyfwrzHWHJibegGa1K-oPHD7OVw_M?usp=drive_link");
                } else if (position == 8) {
                    goToUrl("https://drive.google.com/drive/folders/1uqZ50wDGdw7O8_qgNpqNJ6sQwYKjvJBk?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1aIfWYQOMpaxku0ECmGHbkxe9HuatvEdK?usp=drive_link");
                }else if (position==10){
                    goToUrl("https://drive.google.com/drive/folders/1GJ7r6EPOTmkUiDenIXNmEuE3koVgCI0C?usp=drive_link");
                }else if (position==11){
                    goToUrl("https://drive.google.com/drive/folders/1fF6gZGt6Ff3oADRNc-DE9bQhvCLpSzFH?usp=drive_link");
                }else if (position==12){
                    goToUrl("https://drive.google.com/drive/folders/1LaN0kgmHA8X1wf5SzPlJcOIwv5otSqzn?usp=drive_link");
                }else if (position==13){
                    goToUrl("https://drive.google.com/drive/folders/1TunQEphGmoS17XGOMA-bj0ZXkL3kga6w?usp=drive_link");
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