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

public class b_tec_civil extends AppCompatActivity {

    Toolbar toolbar;
    Spinner sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    AppCompatButton btn_sem1,btn_sem2,btn_sem3,btn_sem4,btn_sem5,btn_sem6,btn_sem7,btn_sem8;

    ArrayList<String> arrsem1=new ArrayList<>();
    ArrayList<String> arrsem2=new ArrayList<>();
    ArrayList<String> arrsem3=new ArrayList<>();
    ArrayList<String> arrsem4=new ArrayList<>();
    ArrayList<String> arrsem5=new ArrayList<>();
    ArrayList<String> arrsem6=new ArrayList<>();
    ArrayList<String> arrsem7=new ArrayList<>();
    ArrayList<String> arrsem8=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bs_c);

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
        arrsem1.add("Environmental Studies - I");
        arrsem1.add("Law for Engineers");
        arrsem1.add("Engineering Mechanics");
        arrsem1.add("Workshop Practices");
        arrsem1.add("Introduction to Computers and Programming in C");
        arrsem1.add("Technical Communication – I");

        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem1);
        sem1.setAdapter(adpsem1);

        btn_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1A2b0Ao2jyB3rQYATJRkPiaiEUCrt9bRV?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1Vnt48xZqyy0MVatq32JwfoW6peTsjW4n?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1npnevLP1JZAYk1VK0ZOiR7FfyGV62GXq?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1eXyJ4tLj3_FZJvmN8mI3mTV1dzK6hDwA?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1-B7-N-OlwCMc4iYuEiJMUUJ7j9U-B0fb?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/15m_peXpsLShC7PM3dT6BkdFj-_QpM3w9?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1_sqYaCsauKQm-rrMubOlPrC_ouuJULsF?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1QjcxkgDe_sKzXUXcLqRSm0dQygUpfw8F?usp=drive_link");
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

        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem2);
        sem2.setAdapter(adpsem2);

        btn_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1ZYIPVlvPunreGgjw5T5SosT0dkWWVl46?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1NjfS2vFd3J9hI7tP-dhG5TUWEoUb2uUs?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1vN-Zqr0Xe42CxBtvPh-mS3xUnTj3Mm_A?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1u2K_sO4czKa02YZ0-gxAsLL1sV79uhUX?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1iYbracrfv91CBzdQKoZ_UrHweR8JwUaQ?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1P_xI_Fng6txqxLwNnTvFUL9rptEC8ixb?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/12te3_OCVf3CAiuq5KPVIjsKyMoe15OOA?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1xDROgZYGdZBa4jnnzwGf4q9DUGHsaZr4?usp=drive_link");
                }
            }
        });

        // for semester 3
        arrsem3.add("Applied Mathematics- III");
        arrsem3.add("Strength of Materials");
        arrsem3.add("SURVEYING AND GEOMATICS");
        arrsem3.add("Mechanics of Fluids");
        arrsem3.add("Object Oriented Programming Using C++");
        arrsem3.add("Engineering Materials");
        arrsem3.add("Term Paper");


        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem3);
        sem3.setAdapter(adpsem3);

        btn_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1YI8p9vUj0N9c1epvGHriLi66TmYtsr4B?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1fSEoy-NOJxx8IcMya3jx2KMFB4QQ9KZl?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1MwXUPPIluPYXB2BmbLTFRtnhHxZTDZkl?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1lFDGIQM99ZTn2wVxqbAJA1hsIDRRThqv?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1bTxio9l1qxWz8zaWIT3S33g7TNp7sTNa?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1AfDU-PQUOb36I3a7UsVsqkigoSI2Cyzu?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1TYgZN7J65uihPAEZMDsJEDuvjiq5i8Ym?usp=drive_link");
                }
            }
        });

        // for semester 4
        arrsem4.add("Applied Mathematics-IV");
        arrsem4.add("Structural Analysis - I");
        arrsem4.add("Building Materials");
        arrsem4.add("Transportation Engg.");
        arrsem4.add("Soil Mechanics");
        arrsem4.add("Basic Simulation Lab");
        arrsem4.add("Introduction to smart Building Materials");
        arrsem4.add("Self-Reliance and Socialization");



        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem4);
        sem4.setAdapter(adpsem4);

        btn_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1kFVp84nqlTqiM0t306n2bPuzMcbHl7R2?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1Ea8YOPFs148CFTj7M9ox-qKz9w1Lc0xA?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1xMmY5ojUtw1Eca-ZiWRyg5RL0lGRK6-g?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/14lVDqfcwQTpU-ZSIs5Y2MXgbUSRNto2R?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1xjWRTkfmqs6bZYPzAxaJrvFC2YVMiAmR?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1FAENfd5u7WBLd35verQCJ7c5ijMgPLq8?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1WyKFV146RPNwAB5CBRPopDjOMilnI7kV?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1EDhIFDETUkLcxBZh6X0syeYiDuHlC_Lk?usp=drive_link");
                }
            }
        });

        // for semester 5
        arrsem5.add("Structural Analysis - II");
        arrsem5.add("Concrete Technology");
        arrsem5.add("Design of Reinforced Concrete Structures");
        arrsem5.add("Structure Detailing Lab");
        arrsem5.add("Aptitude and Reasoning Ability");
        arrsem5.add("Geology for Civil Engineering");
        arrsem5.add("In-House Practical Training");
        arrsem5.add("Water Resources Engineering");
        arrsem5.add("Cognitive Skills, Leadership and Decision Making");


        ArrayAdapter<String> adpsem5=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem5);
        sem5.setAdapter(adpsem5);

        btn_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1MluTVBikHhJjwVtGSZPFM0a7jZANwAeH?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1nVo9hNsBOqHMA--mA2O4WiTzCgpegTW2?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1aWtxp1jnsHJJQ_mfKS5A5sLa-dUFLPa1?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1lBbwSgQfTb1HfBEqYPePrb0hdM53AFaO?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1suiLFHMdxPWBaagPe1nYETR_gqbJjgCI?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1ZBtOxbfwO9_xwHeu0_hbJxX63Ax5I4gR?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1i_0o2qeXxusCCO3ZolgRq0lrLbPHPCCI?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1aTKgp-QD7Th0leWb_OR1vp_AYzKM_KD7?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1Qy6xhPbhLfYbqdmaRfIpbN6kfsp90ySR?usp=drive_link");
                }
            }
        });

        // for semester 6
        arrsem6.add("Hydraulics and Hydraulic Machinery");
        arrsem6.add("Design of Steel Structures");
        arrsem6.add("Environmental Engineering");
        arrsem6.add("Building Maintenance and Repairs");
        arrsem6.add("Finite Element Method and Applications in Civil Engineering");
        arrsem6.add("Construction Practices and Equipments");
        arrsem6.add("Software Application In Construction Management");
        arrsem6.add("Professional Ethics and Social Responsibility");


        ArrayAdapter<String> adpsem6=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem6);
        sem6.setAdapter(adpsem6);

        btn_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem6.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1BnoYaoYwoSoZDvLHhhKaDQjfoBSaxfBV?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1wrCOokHFQUnHO2R0-uZb7YQDYGGubmFm?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1v3vrBM9VTDuUP01F-zGa1gJk3oaBVq3B?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1DQ1nqEI5vK-WpaXmYtRJyig-n3AbzNI-?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1Bt8NQXl-HG-uBlOBorIrLynKGWxQgBxe?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1wm7D8MC-4QzvEFk5tXZOnpCzz9diNd2m?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/10ctdOKuz5DW1p7ERKiY8V_fguGkgTjXo?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1jeTSvw2zG7JzNpTnu7K9PM5O0ZgucwY4?usp=drive_link");
                }
            }
        });


        // for semester 7
        arrsem7.add("Traffic Engineering and Management");
        arrsem7.add("Green Concepts in Buildings");
        arrsem7.add("Foundation Engineering");
        arrsem7.add("Environmental Pollution Control Engineering");
        arrsem7.add("Industry Internship");
        arrsem7.add("Minor Project");
        arrsem7.add("Construction Practices and Equipments");

        ArrayAdapter<String> adpsem7=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem7);
        sem7.setAdapter(adpsem7);

        btn_sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem7.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1wi9yYPVBs9meTiAsktzwrsH4PKDDdTA7?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1DOmaGBArLuuJo47OqvEudmgBzoBFgIUa?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1brz05Lfd3ujIOtFOuCQ7iHW8lZvZhdOM?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1JN3IYhPX5t1r5V5MXLUogjv9bWnn9hql?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1KjLbUuRCNXhOrTM-5EbXvPjBvwi_7Bt7?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1m9WODq1x-p4YgQ80SXJySoLFqgWJM_JM?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1TUH_D8rt73v73U401g3BaVFQFJcQz_Zu?usp=drive_link");
                }
            }
        });

        // for semester 8
        arrsem8.add("Major Project");

        ArrayAdapter<String> adpsem8=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem8);
        sem8.setAdapter(adpsem8);

        btn_sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem8.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/1wb7S3aFWiQ8mZyWlVu9x5EioFgH-Gxff?usp=drive_link");
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