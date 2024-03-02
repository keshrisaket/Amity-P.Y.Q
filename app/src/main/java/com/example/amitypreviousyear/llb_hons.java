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

public class llb_hons extends AppCompatActivity {

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
        setContentView(R.layout.activity_llb_hons);


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
        sem1arr.add("Law of Property");
        sem1arr.add("Law of Crimes (Indian Penal Code)");
        sem1arr.add("Law of Torts (M V Act 1988 and C P Act, 1986)");
        sem1arr.add("Constitutional Law of India-I");
        sem1arr.add("Law of Contract I (General Principles)");
        sem1arr.add("Environmental Law");
        sem1arr.add("Hindi - 1A");


        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem1arr);
        sem1.setAdapter(adpsem1);


        btn_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1QXXd0ONsx0sZumP8w4-yUKB8xJIaT1bC?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1WdazIkH6-hQQF8mjrpaWWBiFaBPpAwEA?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1QBijiR5HPog7cDS7imMjqlGTTKeO4wzM?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/11HlzbUTejIQoaid-_qQjGuUDdW20qzFu?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1O4WfZfCMa6eD8t3puhvP80Hm5_GuM7K6?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/11wTowJeo4hBDyLsaAUlaZ7Jg9WuzBDFG?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1k0GXzMC8DxMciX0nkxLxuPSDjd1NvlUw?usp=drive_link");
                }
            }
        });

        // for semester 2
        sem2arr.add("Legal Method");
        sem2arr.add("Administrative Law");
        sem2arr.add("Family Law - I");
        sem2arr.add("Constitution Law of India II");
        sem2arr.add("Law of Contract II (Specific Contracts)");
        sem2arr.add("Criminal Procedure code");
        sem2arr.add("Hindi - II");
        sem2arr.add("Arbitration and Alternate Dispute Resolution");


        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem2arr);
        sem2.setAdapter(adpsem2);


        btn_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1JZx4PnESi1CQ6hc8AHjx9tmGUT-b9qdo?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1SLrV8eu0RmikFZD2SPyrlVGY_LjnnOqo?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1W6PO78J8twgbhoS8LBT7tuUxkfIqhVML?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1W8aqKztctJX-gt2o-krVvfSSaSfwu96s?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1tCyzDCbB6yDuJ-ihrnZW6G3ePo949x1V?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1_pnjL7OFXhm5oBV8xeTe_sSs1buM0No6?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1BZNJYd3s9PmTuNBi17TAf62o90KbbfrJ?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1rxsSIe-1J7W4k93AvzjZtTxF8SNqJWSg?usp=drive_link");
                }
            }
        });

        // for semester 3
        sem3arr.add("Professional Ethics");
        sem3arr.add("Labour Law - I");
        sem3arr.add("Family Law I(General Principles)");
        sem3arr.add("Public International Law");
        sem3arr.add("Term Paper");
        sem3arr.add("Legal History");
        sem3arr.add("Women and Criminal Law");
        sem3arr.add("Competition Law");
        sem3arr.add("Real Estate Law");
        sem3arr.add("International organization");


        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem3arr);
        sem3.setAdapter(adpsem3);


        btn_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1zma7I4zgkV1vf6NhFx7RSSHNRIsnAf7Z?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1Hix5XR0aGUUhCtxVUNySgvIZFbonRftH?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1VOtaIC-q104ChkNLHxwCG0XO_dG2o8ln?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1UIshkvE59UQeS7akd3x-4SuWt2oJD5sU?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1jb1kuvI5IN5ss0gbAo4SjbJwf2UDFCsf?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1_Ce_MNsV_LfZbps4UKZOoMqm49aw667c?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1L_lVigAADc8jidVZbuW8nStkotZEdY5W?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1_fmUjv_TN-UUxC6VEzbeA-W_YfZVNj13?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1Razvxyd6fA-MTVbqc0SXYrA6k9rqamls?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1zTV5WA3191Yq5YNswueEG38dqsEu7UMq?usp=drive_link");
                }
            }
        });

        // for semester 4
        sem4arr.add("Drafting Pleading and Conveyancing");
        sem4arr.add("Criminal Procedure code");
        sem4arr.add("Labour Law - II");
        sem4arr.add("Interpretation of Statutes");
        sem4arr.add("Intellectual Property Law");
        sem4arr.add("Private International Law");
        sem4arr.add("Banking Law");
        sem4arr.add("Investment Law");
        sem4arr.add("Indian Federalism");


        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem4arr);
        sem4.setAdapter(adpsem4);


        btn_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1iVtCLxj_sge1mQJTAMjUttYF8gcmLcJ5?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1w-jlU5G4xC2hW4Gv_osLt2I9hFtIHi1Z?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1EQRh7wo5K9tszEnDjGxpfZXGkmjnWA70?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1lSikNZZIHMnkwnkQefBWXL88fyVeV0gr?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1VIMPjy8abYr-dHHimK0qfAvMNtFq3D2a?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1exaI6biJnmn7jJReBRXk8_T47ytqwjy7?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1A_FmG4PIONue2K643MdTYM2d-gJuZDoz?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1gDF_mBLpgNb_X7v4-PCoAntwT26FPX49?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1eGhX9CbgiIuon-qm9tpwIkKX2gM8hjYg?usp=drive_link");
                }
            }
        });

        // for semester 5
        sem5arr.add("Company Law");
        sem5arr.add("Taxation Law");
        sem5arr.add("Law of Evidence");
        sem5arr.add("Insolvency and Bankruptcy Laws");
        sem5arr.add("Information Technology Law");
        sem5arr.add("Corporate Governance");
        sem5arr.add("Media and Law");
        sem5arr.add("Equity and Trust");
        sem5arr.add("Summer Internship");


        ArrayAdapter<String> adpsem5=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem5arr);
        sem5.setAdapter(adpsem5);


        btn_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1Lu0z-0an7cgHfp2FAo1fPc_oXPLQL7u4?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1u-57KHI2I-8-tUrf2ySUOlUn6mkwJQRB?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1kktps65n9UGNmw1elHaVgYY90vUuRWti?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1Z5wqj6cLV6m5JLPkKh0huJKeOb43HkBP?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/18SV9skZ5jt7K9TD_MYHLkRGheV0WmBJf?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1ZZMUQRADZM4mTMjwDz1kaATfaRarSP_n?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1csV5rw7sKJAhAyigrc24TRE41Xtg3W27?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1u4LgNmTmtuBTGF8oiJCwfVje84MGC0v_?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1qBMaLQ2_UnSDocO7tAN46SoabPzyBVh1?usp=drive_link");
                }
            }
        });

        // for semester 6
        sem6arr.add("Moot Court Internship");
        sem6arr.add("Dissertation");

        ArrayAdapter<String> adpsem6=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,sem6arr);
        sem6.setAdapter(adpsem6);


        btn_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem6.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/1qBMaLQ2_UnSDocO7tAN46SoabPzyBVh1?usp=drive_link");
                } else if (position == 1) {
                    goToUrl("https://drive.google.com/drive/folders/1YlttSP57OU3EssLO0bPFRSdcVHlLSJ2d?usp=drive_link");
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