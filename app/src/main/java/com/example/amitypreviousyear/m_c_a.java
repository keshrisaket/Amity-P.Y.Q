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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class m_c_a extends AppCompatActivity {

    Toolbar toolbar;


    AppCompatButton but_sem1,but_sem2,but_sem3,but_sem4;

    Spinner sem1,sem2,sem3,sem4;

    ArrayList<String> sem1arr=new ArrayList<>();
    ArrayList<String> sem2arr=new ArrayList<>();
    ArrayList<String> sem3arr=new ArrayList<>();
    ArrayList<String> sem4arr=new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc);

        sem1=findViewById(R.id.sem_1_spinner);
        sem2=findViewById(R.id.sem_2_spinner);
        sem3=findViewById(R.id.sem_3_spinner);
        sem4=findViewById(R.id.sem_4_spinner);
        but_sem1=findViewById(R.id.but_sem1);
        but_sem2=findViewById(R.id.but_sem2);
        but_sem3=findViewById(R.id.but_sem3);
        but_sem4=findViewById(R.id.but_sem4);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

        // for semester :1

        sem1arr.add("Advanced Database Management Systems");
        sem1arr.add("Advanced Software Engineering Principles");
        sem1arr.add("Network Security and Cryptography");
        sem1arr.add("Data Structures and Algorithm Design");
        sem1arr.add("Discrete Mathematics for IT");
        sem1arr.add("Professional & Business Communication");

        ArrayAdapter<String> adp_sem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem1arr);
        sem1.setAdapter(adp_sem1);

        but_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/11dWKh1sLuRH9zGG0CKF2avy_8Kdik5Xz?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/15BU_l0KMZqYtFH1ou0_ZjSU31D9LKP_n?usp=drive_link");
                }else if(position==2){
                    goToUrl("https://drive.google.com/drive/folders/1yVJVPA1FQHIvZBptZQE5R-Gp-YMakhMY?usp=drive_link");

                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/197maOW3yuqZo3Pb_vyfVUcJNnVl-tNU4?usp=drive_link");

                } else if (position==4) {
                    goToUrl("https://drive.google.com/drive/folders/1ZDPcNvjSaYqyReeVZWe-FXKBtuLE-guf?usp=drive_link");
                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/18CsISwreL1gj8E_464GYKVZ0mv-Y9zeK?usp=drive_link");

                }
            }
        });

        // for semester :2

        sem2arr.add("Cloud Computing and its Applications");
        sem2arr.add("IOT Fundamentals: Big Data & Analytics");
        sem2arr.add("Advanced Web Technologies");
        sem2arr.add("Core Java");
        sem2arr.add("Innovation by Design");
        sem2arr.add("Cognitive Analytics & Social Skills for Professional Development");
        sem2arr.add("Image Processing Techniques");

        ArrayAdapter<String> adp_sem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem2arr);
        sem2.setAdapter(adp_sem2);


        but_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1V1bBCXpMXfvzhKFV4HvofG-Hd9AIe2qL?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/17o0F0aRCLZ0XdyYmeFUXUt2fKoGXY8BC?usp=drive_link");

                } else if (position==2) {
                    goToUrl("https://drive.google.com/drive/folders/1Fh8USAxaVcR8rYmKjhja49-wDn4hq3ZE?usp=drive_link");

                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/1qsaAh-G99nHzcXXYek8vKH0kh7v4mqpX?usp=drive_link");

                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1EDkCc9Ib6QLzWvDOLqx4eLoPFwoezQzM?usp=drive_link");

                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/10ic23Wm58UsFAvfl46g1ydThlr322joU?usp=drive_link");

                } else if (position==6) {
                    goToUrl("https://drive.google.com/drive/folders/1qhX9tXmImGfnpsRqz--IFc3LGNGtZyNF?usp=drive_link");

                }
            }
        });

        // for semester 3

        sem3arr.add("Principles of Compiler Design");
        sem3arr.add("Advanced Java");
        sem3arr.add("Machine Learning using Python");
        sem3arr.add("Research Methodologies");
        sem3arr.add("Introduction to Data Analytics");
        sem3arr.add("Summer Internship");
        sem3arr.add("Artificial Intelligence and Robotics");

        ArrayAdapter<String> adp_sem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem3arr);
        sem3.setAdapter(adp_sem3);

        but_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1tDVmmGiOqNIdq6NiEhBCe4YRobcEUAd7?usp=drive_link");

                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/1FBN-fyCAVj6y9VX6mBNi4L2bKTbrYT4K?usp=drive_link");

                } else if (position==2) {
                    goToUrl("https://drive.google.com/drive/folders/1Jp_iSUi-sJzbzIwCZCcnb7LNky7HaWOI?usp=drive_link");

                } else if (position==3) {
                    goToUrl("https://drive.google.com/drive/folders/1Au5gD4RNFJItfeXGPVRrB8giNr536HEu?usp=drive_link");

                } else if (position==4) {
                    goToUrl("https://drive.google.com/drive/folders/1spMdL7Wsp7ZOLYS_2MEKSyfhpNqyr7c-?usp=drive_link");

                } else if (position==5) {
                    goToUrl("https://drive.google.com/drive/folders/1sAWQlv72aEwdI7rFsrZnkVOEHcnmEML-?usp=drive_link");

                } else if (position==6) {
                    goToUrl("https://drive.google.com/drive/folders/1XpBHkaCwTaPKOC_5nZL-CI8-ydyIr6Qm?usp=drive_link");

                }
            }
        });



        // for semester 4

        sem4arr.add("Major Project");
        sem4arr.add("Seminar");



        ArrayAdapter<String> adp_sem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem4arr);
        sem4.setAdapter(adp_sem4);

        but_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if(position==0){
                    goToUrl("https://drive.google.com/drive/folders/1I7ZE11CKu6ixO3O3p_A0YgXw-WSRgkRI?usp=drive_link");
                } else if (position==1) {
                    goToUrl("https://drive.google.com/drive/folders/1-6gyoa6njirZ4OdiPJsXWk5etdCXwA8z?usp=drive_link");
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