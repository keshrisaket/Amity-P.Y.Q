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

public class m_com extends AppCompatActivity {

    Toolbar toolbar;

    Spinner sem1,sem2;

    ArrayList<String> arraysem1=new ArrayList<>();
    ArrayList<String> arraysem2=new ArrayList<>();
    AppCompatButton btnsem1,btnsem2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcom);

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
        arraysem1.add("Advanced Financial Accounting");
        arraysem1.add("Managerial Economics");
        arraysem1.add("Financial Management");
        arraysem1.add("Organization Theory and Behavior");
        arraysem1.add("Marketing Management");
        arraysem1.add("Statistics for Management");
        arraysem1.add("Principles and Practices of Banking");
        arraysem1.add("Business Environment and Law");
        arraysem1.add("Professional & Business Communication");

        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arraysem1);
        sem1.setAdapter(adpsem1);

        btnsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1vj84aJLA1vsQJAHiZKZyje53J-0t_VWI?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1Noki61mLp-Hk7bwcBekPwQJjrb8OU1Bc?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/18ZPo1TJhMcKIDcKFASo05SkPEU7Oobe9?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1nTfAoCnE3T-fmAaIQRwV9dodC0J6RbyX?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/12Da8qmWDSIiCoABscIm65XGxLv9Kd6wS?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1Xg_EiFC-LQNDrcQ0yzO1MXS4gcVJqN6b?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1xthUF_RQAGM8rnl_sUb0CxZRK1RgjFRK?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1TMSKRrmWkIYlkzYL4H8e0CJDguCa4sq0?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1bDqR7eJYRGRpy61h3x4hStANzv5_PNqI?usp=drive_link");
                }
            }
        });

        // for semester 2
        arraysem2.add("Advanced Cost Accounting");
        arraysem2.add("Corporate Tax Planning and Management");
        arraysem2.add("Security Analysis and Portfolio Management");
        arraysem2.add("Business Research Methods");
        arraysem2.add("Corporate Social Responsibility");
        arraysem2.add("Human Resource Management");
        arraysem2.add("Seminar - II");
        arraysem2.add("Cognitive Analytics & Social Skills for Professional Development");


        ArrayAdapter<String>  adpsem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arraysem2);
        sem2.setAdapter(adpsem2);


        btnsem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1eEI1F8xHhCEu-6boTGX0nUCh9GXbS_iU?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1Da-fweZxqV5Ns5Hzle9QF6JEiIWyDtUO?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1AVK1VwG3O2-SJTHpLdN2WaR8XuNDsz8d?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/11Yp-TGpYUEkwTNo4tDj-lpiCc7mJqPVI?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1eBVLjIdjOEV5ZB7fy63yRgL0VxEJgSrO?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1cTr6UBe1aMeL4PGHB8vxos8XJGZ7xoOl?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1ouor3R3cT9IrCGy6dk8R9y0xvU8dW96x?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1yVlSMkOkINALp_Lqhw6ec-x7P6w4HtFn?usp=drive_link");
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