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

public class bba_mba_integrated extends AppCompatActivity {

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
        setContentView(R.layout.activity_bba_mba_integrated);

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

        arrsem1.add("Accounting Fundamentals");
        arrsem1.add("Introduction to Management Principles");
        arrsem1.add("Principles of Marketing- I");
        arrsem1.add("Business Ethics and Governance");
        arrsem1.add("Business Mathematics I");
        arrsem1.add("Introduction to Business Economics");
        arrsem1.add("Computer Applications");
        arrsem1.add("Communication Skills - I");


        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem1);
        sem1.setAdapter(adpsem1);

        btn_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1iiq8msZtSbnvv5wz-CDxMSXwX2N8rgfG?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/19pkgeq6PIsHOy6XrRSJgD6tt4svSOGXk?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1yaYs3wA4zf7D8Cb1DE_I-ylmkWuwFEXd?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1vYWj7CgB7ghbrUKyJYhmV4Z71HQUUgek?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1fczpeBVI0RxtMfobCWiKWRe2vv1Lgi4b?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1PWQ4-RDO530W1vyWPVHhAnHPbILzsXoW?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1CKh-0jDa7NW6OmJpxEf5g0VDSv9b9e-t?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1Zpj9NqUsNFeZu8apDjCm82Dy_IFjAM6l?usp=drive_link");
                }
            }
        });

        // for semester 2
        arrsem2.add("Cost and Management Accounting");
        arrsem2.add("Business Law");
        arrsem2.add("Environmental Studies - II");
        arrsem2.add("Understanding Organizational Behavior");
        arrsem2.add("Principles of Marketing- II");
        arrsem2.add("Business Environment");
        arrsem2.add("Communication Skills - II");
        arrsem2.add("E - Commerce");
        arrsem2.add("Term Paper");
        arrsem2.add("Business Statistics");


        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem2);
        sem2.setAdapter(adpsem2);

        btn_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1HpGfrsJfAROySL_Ugg3zf1j5kUA_HQVh?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/18ZU2XD7TkATGtltc00OvjA7G9KISgxtc?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1SQ0niC8j6PS1abqQfIByHrMy1NIeiFv4?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1qoMoK9VR0xTl0rUvTUxCTU1BdKtXeY6K?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1t2y_RjFmP2hHOsAjHWAA9Lx0wHgQrLon?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1pS37HkmQM60xmHG6Gpc2NKmJwgH8T7IU?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1XJBkV6SXMA1zyHiNy1aEcgUW_BfT2eed?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1v1XZ5m8arTIbN9G-w9C4V6QtLfKnQSlz?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1lBOTvUq3YJY5uz_y9vsEZXEvK6aDipWG?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1xuJyRcTrJCGX46xTmfbfgy4vdXVdo32C?usp=drive_link");
                }
            }
        });

        // for semester 3
        arrsem3.add("Individual Excellence & Social Dynamics");
        arrsem3.add("Fundamentals of Financial Management");
        arrsem3.add("Fundamentals of Research Methods in Global Environment");
        arrsem3.add("Fundamentals of Human Resource Management");
        arrsem3.add("Managing Customer Relationships");
        arrsem3.add("ESSENTIALS OF PRODUCTION AND OPERATIONS MANAGEMENT");
        arrsem3.add("Strategizing using Innovation");
        arrsem3.add("Term Paper - I");


        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem3);
        sem3.setAdapter(adpsem3);

        btn_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1fifPFDMrvRDBA379_Lvo2mSrthNbyRud?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/16xWhwptJ8ux48JbyugJs0hCHFdR_TVO0?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1dbV5Mmmfj2X-fCrRf0zMuV9F_6Bs0zWy?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1pBqX98LYZbuxBDQkgBFZfaCEqivH64VE?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1lDNUtYIy_Qa7wXeP_8EuLMzU3goC69YH?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1NdJPFjRY8dLc8XrLE_4zekBcLMcMfTCN?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1hCTFU1Rpa4cQlY1TgT320FZIqQZFwCM6?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1jKeIFMnoUSUBalvY6yrb-xROlJOVhI3E?usp=drive_link");
                }
            }
        });

        // for semester 4

        arrsem4.add("Export Management");
        arrsem4.add("International Marketing");
        arrsem4.add("Operations Research");
        arrsem4.add("RESEARCH METHODS FOR MANAGERS");
        arrsem4.add("Corporate Tax Planning");
        arrsem4.add("Fundamentals of Project Management");
        arrsem4.add("Banking and Financial Institutions");
        arrsem4.add("Creativity for Team Excellence");


        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem4);
        sem4.setAdapter(adpsem4);

        btn_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1VjTYl9xVZYe2lQL_LoXYqmOEqyihD9_S?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1TTAHCbWlYw0XnMLypjdE4Ehflzv4kjQc?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1rDDWmjubW7UlFS392Pv1PGv9WG_TwwUj?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1_ynh7uORthPwgbw7MZcLsm1gwIyMPdq4?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1U6ciD7dNJKlThBJGB4RoF2mamDjR8YYG?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/10O3QZzeiQ_7zzhxhcCeRm8C3sutVAPJ2?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1gwunVF1Rul5CpviCYeZ2jyY7BiTpMLCd?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/18QwfcIh6E_qt6WrksucxODLdtsjnQUCz?usp=drive_link");
                }
            }
        });

        // for semester 5
        arrsem5.add("Direct Tax - I");
        arrsem5.add("Fundamentals of Entrepreneurial Marketing");
        arrsem5.add("Marketing in Digital Age");
        arrsem5.add("Business Strategy");
        arrsem5.add("Financial Markets and Services");
        arrsem5.add("Investment Analysis and Portfolio Management");
        arrsem5.add("Understanding Organization Change and Development");
        arrsem5.add("Fundamentals of Training and Development");
        arrsem5.add("Service Marketing");
        arrsem5.add("Supply Chain Management");
        arrsem5.add("Summer Internship");


        ArrayAdapter<String> adpsem5=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem5);
        sem5.setAdapter(adpsem5);

        btn_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/18GWODGUUI6wPi7Da-oxlmTyI6Fd7Y3Jp?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1yUoVGq0b_pmYlDqSUFdqm-swEE5lLb1M?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1-fREnzN65KZGr1uFToDzkI6czA-N_7gY?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1cQXZm8T_HQGfYG8cVqwwjMHoFYBK86Mh?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1_Q86go5dBC8l_fhGhZ1UEedmZFB2P_Zw?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1b_pJ6QDFbQ_JPKYBLQyCYch51liy5hKe?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1KnWWY64UIcHbtUABr9rr1A7tuyVqHFx6?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1sdOU-TAjf7c-gkicJuh9vjcRaDgrKCEW?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1voNUdijBnLQS4Y95jJB2od5bHJWMD7pS?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1uS1gRe6-JpD56_2WFzaGp_6X6IoCDd2G?usp=drive_link");
                }else if (position==10){
                    goToUrl("https://drive.google.com/drive/folders/1HIw93tFai4_H4bTiSq3EdQiAhu6RaRSI?usp=drive_link");
                }
            }
        });

        // for semester 6
        arrsem6.add("Direct Tax - II");
        arrsem6.add("Understanding Leadership and Motivation in Organization");
        arrsem6.add("Sales and Distribution Management");
        arrsem6.add("Human Values and Community Outreach");
        arrsem6.add("Fundamentals of Competitive Intelligence and Business Development");
        arrsem6.add("Advance Corporate Finance");
        arrsem6.add("Fundamentals of International Human Resource Management");
        arrsem6.add("Risk Management - BSI");
        arrsem6.add("Understanding Industrial Relations and Labour Laws");
        arrsem6.add("Brand Management");
        arrsem6.add("Fundamentals of Retailing");
        arrsem6.add("Dissertation");
        arrsem6.add("Social Communication");


        ArrayAdapter<String> adpsem6=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem6);
        sem6.setAdapter(adpsem6);

        btn_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem6.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/10iryNjywBuWkM71WMNpkyd5-ooSyw-YE?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/14-WkcdruRFO0W3TrxrlAJY4SutkOl4mE?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1FgnZOpPorxyAIZW6WNdKxjXklRk9aSO3?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1nLJS_9sxFxsgohcGuiHP0SZ8sMha3qTa?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1f9y4D-jtZ1DDUIdOn0JPUKf_KPf9SBxO?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1Q8D60qa30ZatApzRgxVaC5tZ0HZbgFJJ?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1FsezIQOrdxl5F4--fVZ-oR22Hwq442_6?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/170mtSLVuXatWir53jGaxJiwzvY2KGAcL?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1ACmQ350eJiVoVuqhiFEqDNy2fpGceUdI?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1XtdgSSElktS_VfG61rfKiQF_xfOr5yf5?usp=drive_link");
                }else if (position==10){
                    goToUrl("https://drive.google.com/drive/folders/1FY9DLu_JEWCserPKAeSMLWqSbRs17yup?usp=drive_link");
                }else if (position==11){
                    goToUrl("https://drive.google.com/drive/folders/1xySrCerp5hOnJEepCRVzPaKwoA7p83-f?usp=drive_link");
                } else if (position == 12) {
                    goToUrl("https://drive.google.com/drive/folders/15XfhEa-8MMLsci0afwiEum9ypRM6B2O8?usp=drive_link");
                }
            }
        });

        // for semester 7
        arrsem7.add("Management in Action - Social Economic and Ethical Issues");
        arrsem7.add("Global Leadership");
        arrsem7.add("Recruitment Selection and Retention");
        arrsem7.add("Product and Brand Management");
        arrsem7.add("Sales Management");
        arrsem7.add("I.T. Project Management");
        arrsem7.add("Data Mining and Data Warehousing");
        arrsem7.add("Security Analysis and Portfolio Management");
        arrsem7.add("Management of Financial Services");
        arrsem7.add("Professional & Business Communication");
        arrsem7.add("WORKPLACE PSYCHOLOGY");
        arrsem7.add("Summer Internship - I");



        ArrayAdapter<String> adpsem7=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem7);
        sem7.setAdapter(adpsem7);

        btn_sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem7.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1H8V5i1d6zX5kudScJfEGwMv92R2FbimA?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1D1YW89WrGoR1-ZNZWGZwLUz09UaZUHjW?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/15LdqRht_ZfboRIOB2-12DRFVHAKCJS8v?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1K0Tq_B8Bf_elmTdNufwe9CMN4lExH6wV?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1Zv2JyUwU7YCqOpGK1RebF7kF_MR43T8L?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1L-0ceHpbhG22-viH5Ti3Pf2307G0x9yh?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1UNXFwuDCI_AipbCqtwjAwz0DxKtVUmaI?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1wEckaFT9tSvN3bPDZGCmn2YPYB_XAi6-?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1LuSctcMsoIK5afiiRmjQV_0LTh1qC_LQ?usp=drive_link");
                }else if (position==9){
                    goToUrl("https://drive.google.com/drive/folders/1n-VOGA5NLR3Mj_PsMS2xY2hHemRxIXP8?usp=drive_link");
                }else if (position==10){
                    goToUrl("https://drive.google.com/drive/folders/1oM7Hc1S2cBBrzaQ_yIzU8VykZAIrTGSb?usp=drive_link");
                }else if (position==11){
                    goToUrl("https://drive.google.com/drive/folders/1KTEnN-ynQHsRbtVWh5NjiLDKcQe88f-F?usp=drive_link");
                }
            }
        });

        // for semester 8
        arrsem8.add("Strategic Management");
        arrsem8.add("Enterprise Cloud Computing");
        arrsem8.add("Data Visualization: Tools and Techniques");
        arrsem8.add("Cyber security & Risk Management");
        arrsem8.add("Training and Development");
        arrsem8.add("Power, Politics and Leadership");
        arrsem8.add("Managerial Counselling");
        arrsem8.add("Dissertation");
        arrsem8.add("Cognitive Analytics & Social Skills for Professional Development");






        ArrayAdapter<String> adpsem8=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrsem8);
        sem8.setAdapter(adpsem8);

        btn_sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem8.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1hipNe7QaSplyUrZnFUSBrCsDavUtKoPu?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1FWYGqVAgkP-vNZ813Y2b8uD6nWm-buIv?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1VSUy5PF3h4RJzlVLsvn0c26ejkNj-7lJ?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1Ywjfpx1xs0f0roHzr6AGpbi3zunFtAYo?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1Cv1D2ybrEBBl1XUMAZUHpuMlCNo4n0-x?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1z7GpQdhSYW4HhpyGd994gX9n2l9wUaco?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1JpBtqiDBiuzp7SLRm7sk2Cbe1PGWixl-?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1dLAMH3pF_UNu2B14a3qUBGdoWa4IIcoe?usp=drive_link");
                }else if (position==8){
                    goToUrl("https://drive.google.com/drive/folders/1V0T09Ou6znglHm61zUS-CL7ppeosxi2C?usp=drive_link");
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