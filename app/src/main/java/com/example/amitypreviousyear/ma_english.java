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

public class ma_english extends AppCompatActivity {

    Toolbar toolbar;

    Spinner sem1,sem2;

    ArrayList<String> arraysem1=new ArrayList<>();
    ArrayList<String> arraysem2=new ArrayList<>();
    AppCompatButton btnsem1,btnsem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_english);


        sem1=findViewById(R.id.sem1);
        sem2=findViewById(R.id.sem2);
        btnsem1=findViewById(R.id.btn_sem1);
        btnsem2=findViewById(R.id.btn_sem2);


        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }



        // for semester 1
        arraysem1.add("Greek and Latin Literature in Translation");
        arraysem1.add("English Literature From Medieval Period to 17th Century");
        arraysem1.add("Elizabethan and Jacobean Drama");
        arraysem1.add("Restoration and Augustan Prose and Poetry");
        arraysem1.add("Cinema and Gender");
        arraysem1.add("Professional & Business Communication");

        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arraysem1);
        sem1.setAdapter(adpsem1);

        btnsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1lIFwBmlXLuumdyTEmuLV19GPME51bJj-?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1UNRcqcIL23ueZiM_jH1izCJjXKHWC2-c?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1TMLpElkDE9YSJQbFcM8qAqQe4Qfh64gQ?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1wZNqTW_2riyYQhLhimx86djjBJHRQiAI?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1V3n9GTbh1sgpfr3a_Or9MlRP6Yd_YiAJ?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1NceWI98HqjjW2Ch27HVYXdTahyTX3zVw?usp=drive_link");
                }
            }
        });


        // for semester 2
        arraysem2.add("Drama From Restoration to Victorian Age");
        arraysem2.add("18th and 19th Century Novels");
        arraysem2.add("Literary Theory");
        arraysem2.add("South Asian Literature");
        arraysem2.add("American Literature");
        arraysem2.add("Approaches to Film Studies");
        arraysem2.add("Cognitive Analytics & Social Skills for Professional Development");

        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arraysem2);
        sem2.setAdapter(adpsem2);


        btnsem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1u43clIzRjIUpv1F6UuFth13o5ePEeCW4?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/12wy_jmKkARAzjtIJkzwAI9vkCslBzVo8?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1hAEuScQiujYF8vjJotcFyW3ZD5ouSAoo?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1esj8n68YXmF2zwTcOMoIMtWaj6j--45m?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1BikJ2v_nYRzipwjKXQNXRml7afjRLK4V?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1kQcIRz_3zOgCKPa8snocuvAcp0Ho7XbN?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1xzuVWGN8AoEKjjZWULb-nXHaJXS1AQOs?usp=drive_link");
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