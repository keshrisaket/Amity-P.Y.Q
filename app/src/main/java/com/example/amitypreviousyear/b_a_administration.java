package com.example.amitypreviousyear;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class b_a_administration extends AppCompatActivity {

    Toolbar toolbar;


    Spinner sem1;
    ArrayList<String> arrsem1=new ArrayList<>();
    AppCompatButton btnsem1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_administration);

        sem1=findViewById(R.id.sem1);
        btnsem1=findViewById(R.id.btn_sem1);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }





        // for semester 1
        arrsem1.add("Introduction to Public Administration");
        arrsem1.add("Non-State Actors and International Relations");
        arrsem1.add("Indian National Movement & Constitution of India");
        arrsem1.add("Introduction to Basic Concepts of Sociology");
        arrsem1.add("Fundamentals of Environmental Studies");
        arrsem1.add("Communication Skills - I");




        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem1);
        sem1.setAdapter(adpsem1);

        btnsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1fTUXIJW6bpl6Wgf3W_Tbe7stbr0IKFJ6?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/16Tjm49TcOc8yYJqNKD6tXJ66f6zmrLNk?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1Yb34XRUT53SbdhJ9V-HVdbZCeGuSt-HD?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1z8F6LJHlPxiOAQOlsjuia5z71mTyUbbL?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1fpmo91aMlNz3FV1uX-auX8E7MGC8kwTP?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1MigBRlVH42Og1Q-l5nQlRXuQXMOk4pWn?usp=drive_link");
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
        Intent intent =new Intent(Intent.ACTION_VIEW,u);
        startActivity(intent);
    }
}