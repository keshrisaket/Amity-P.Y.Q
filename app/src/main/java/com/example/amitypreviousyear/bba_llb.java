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

public class bba_llb extends AppCompatActivity {

    Toolbar toolbar;
    Spinner sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8,sem9,sem10;
    AppCompatButton btn_sem1,btn_sem2,btn_sem3,btn_sem4,btn_sem5,btn_sem6,btn_sem7,btn_sem8,btn_sem9,btn_sem10;
    ArrayList<String> arrsem1=new ArrayList<>();
    ArrayList<String> arrsem2=new ArrayList<>();
    ArrayList<String> arrsem3=new ArrayList<>();
    ArrayList<String> arrsem4=new ArrayList<>();
    ArrayList<String> arrsem5=new ArrayList<>();
    ArrayList<String> arrsem6=new ArrayList<>();
    ArrayList<String> arrsem7=new ArrayList<>();
    ArrayList<String> arrsem8=new ArrayList<>();
    ArrayList<String> arrsem9=new ArrayList<>();
    ArrayList<String> arrsem10=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba_llb);

        sem1=findViewById(R.id.sem1);
        sem2=findViewById(R.id.sem2);
        sem3=findViewById(R.id.sem3);
        sem4=findViewById(R.id.sem4);
        sem5=findViewById(R.id.sem5);
        sem6=findViewById(R.id.sem6);
        sem7=findViewById(R.id.sem7);
        sem8=findViewById(R.id.sem8);
        sem9=findViewById(R.id.sem9);
        sem10=findViewById(R.id.sem10);

        btn_sem1=findViewById(R.id.btn_sem1);
        btn_sem2=findViewById(R.id.btn_sem2);
        btn_sem3=findViewById(R.id.btn_sem3);
        btn_sem4=findViewById(R.id.btn_sem4);
        btn_sem5=findViewById(R.id.btn_sem5);
        btn_sem6=findViewById(R.id.btn_sem6);
        btn_sem7=findViewById(R.id.btn_sem7);
        btn_sem8=findViewById(R.id.btn_sem8);
        btn_sem9=findViewById(R.id.btn_sem9);
        btn_sem10=findViewById(R.id.btn_sem10);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }


        //for semester 1
        arrsem1.add("Basic Concepts of Financial Accounting");
        arrsem1.add("Basics of E-Business for Lawyers");
        arrsem1.add("General Legal English");
        arrsem1.add("Organisation Behaviour in Legal Profession");
        arrsem1.add("Law of Torts (M V Act 1988 and C P Act, 1986)");
        arrsem1.add("Law of Contract I (General Principles)");
        arrsem1.add("Environmental Studies and Law");
        arrsem1.add("Fundamentals of Management for Lawyers");


        ArrayAdapter<String> adpsem1=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem1);
        sem1.setAdapter(adpsem1);

        btn_sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem1.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1YbCq5zKiAqGWzzee8Y6pJexIkvEl40uU?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1k95zXwgl4RIKSutopFGkO-NvptnI8Kka?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/10dY9PF2-xak7LMeoD-XY2X70QjRp13HY?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1WmUiWBEbR6obC0anyQ5Rv_Dd_Z8pgrEp?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1tUDAXoE1wVVtR4IdtGuvPb6kc1y0-LoG?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1VYKiQpa6lyPTDE3OMZb9sYOMpGdG_LZu?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/12f5_tu7D8x_HihuaHA4jEG_YhooFCbxw?usp=drive_link");
                }else if (position==7) {
                    goToUrl("https://drive.google.com/drive/folders/13YF-fbLGU4GM9VrcS4st24v9sz67phkC?usp=drive_link");
                }
            }
        });


        // for semester 2
        arrsem2.add("Basics of Financial Management");
        arrsem2.add("Introduction to Banking and Financial Institutions");
        arrsem2.add("Concepts of Economics for Managers");
        arrsem2.add("Fundamentals of Project Finance and Management for lawyers");
        arrsem2.add("Legal Method");
        arrsem2.add("Environmental Studies and Law - II");
        arrsem2.add("Law of Contract II (Specific Contracts)");
        arrsem2.add("English Literature for Lawyers");



        ArrayAdapter<String> adpsem2=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem2);
        sem2.setAdapter(adpsem2);

        btn_sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem2.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1tgqX3FGlj0tetBKyS63A09pcc80A5WUG?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/18mdEi2WWgf57TYNSRDEh-I-Ds9rgcOZZ?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1yAUNXxIzSlvASLUDaTLLN6Rg-f2S2eZF?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1CpFJ0Lr1rDN6A2Kfzj6nCSo79D69DMGx?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1jnx3zg-UQikphFqrYxcBgcaHD0QiwTqA?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1yd4NX7Ct02EuKKwdEqwn52s4VHAdsGl4?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1W8NwGEkEM-ro_hHt1KsuBzvHlmvoISL6?usp=drive_link");
                }else if (position==7) {
                    goToUrl("https://drive.google.com/drive/folders/1qziYV2cnSF6GdfdXwpOrsJLw0gCTVw8x?usp=drive_link");
                }
            }
        });

        // for semester 3
        arrsem3.add("INTRODUCTION TO ARTIFICIAL INTELLIGENCE FOR MANAGERS");
        arrsem3.add("Scanning of Business Environment for Lawyers");
        arrsem3.add("Law of Crimes (Indian Penal Code)");
        arrsem3.add("Constitutional Law of India-I");
        arrsem3.add("Basics of Entrepreneurship for Lawyers");
        arrsem3.add("Summer Internship - I");
        arrsem3.add("Hindi - 1A");
        arrsem3.add("BUSINESS ETHICS AND CORPORATE GOVERNANCE");


        ArrayAdapter<String> adpsem3=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem3);
        sem3.setAdapter(adpsem3);

        btn_sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem3.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1nGgbXdWl67ILupcVUAEyasgYzeqsU7Ar?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/13HdaouMSo2GETcMP6dnZcsIpUw1Zo3bA?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1AdVK0YLMGGft-4Upn1GG5WNpfCbkXn4N?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1q9MTsjQoMrKCY0ut0kk4h8hlRjelp60F?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/12GSlR6jWs-__MdUIcrGWuXfw1yQ1I4d6?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1gIdBcfb83SEHyQKxKT4BJvuPmpzX8wRM?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1_ecrRjku-jkIIz-xtK_xYGxGCVekIMp8?usp=drive_link");
                }else if (position==7) {
                    goToUrl("https://drive.google.com/drive/folders/1j-9ClqsiDIJNWD2jlevZU8D1AVj1MSS1?usp=drive_link");
                }
            }
        });

        // fro semester 4
        arrsem4.add("Data Driven Decision Making");
        arrsem4.add("Fundamentals of Business Statistics");
        arrsem4.add("Criminal Procedure code");
        arrsem4.add("Constitution Law of India II");
        arrsem4.add("COMPENSATION MANAGEMENT FOR LAWYERS");
        arrsem4.add("Brand Management for Lawyers");
        arrsem4.add("Hindi - II");

        ArrayAdapter<String> adpsem4=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem4);
        sem4.setAdapter(adpsem4);

        btn_sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem4.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1sWQgIfi0qf2l3r_zUT2UjYpBXUZDZt-g?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1RBZLNSO5v2l-nspXxpnVusUoTtkq3arP?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1YvMPYECww_UHiYbPwT-Ybb3_fPEbCSeJ?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1G2ruoF2yEvo9-tyeuQ1Y4gtiYPxSiv4F?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1HLAMwo-C_u29XeJ6TI-axOhj4LjlchKk?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/12URd7prH_mXJWwSPfJvgTLLUkmL5dE-I?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1mnmE_hB8QtpeZOQLm6PzFrLtk3UQ6OBN?usp=drive_link");
                }
            }
        });

        // for semester 5
        arrsem5.add("Communication Client Interviewing Counselling and Advocacy Skills");
        arrsem5.add("Family Law I(General Principles)");
        arrsem5.add("Evidence Law");
        arrsem5.add("Labour Law - I");
        arrsem5.add("Hindi - 3A");
        arrsem5.add("Research Methodology and Report Preparation");
        arrsem5.add("Organisational Development and Change for Lawyers");
        arrsem5.add("Term Paper");



        ArrayAdapter<String> adpsem5=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem5);
        sem5.setAdapter(adpsem5);

        btn_sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem5.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1jvEIjYK7RFXORMk32c9RfBhERUw7CfG8?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1pMmxM0T1YWTO5Mu9-wDNVB8EFNpRBxMz?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1l4wZYoP8FN-kmVwhzv3iiL6hGZLAXHr6?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1UJ2aoZblTFbRpu98WNMUWwx_4IvOSXDA?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1QGguuz1yqBNkZ75lT_ca9DfBepZ93IqA?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1r6A4b-MK0Mkzx-jBTsnSJuJPVMc0YrYW?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/19eplylhPuaEIF4qDJ0JrHLRdSJybx2_U?usp=drive_link");
                }else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1lim0icY-HtrzdTIqxzuLXM8K34dCYHz0?usp=drive_link");
                }
            }
        });

        // for semester 6
        arrsem6.add("Arbitration & ADR");
        arrsem6.add("INTERNATIONAL HUMAN RESOURCE MANAGEMENT FOR LAWYERS");
        arrsem6.add("Family Law II (Wills & Succession)");
        arrsem6.add("Labour Law - II");
        arrsem6.add("Company Law");
        arrsem6.add("Hindi - IV");
        arrsem6.add("International Marketing for Lawyers");



        ArrayAdapter<String> adpsem6=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem6);
        sem6.setAdapter(adpsem6);

        btn_sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem6.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1MSzuIJiMQodMgqqn4MZ0bUrA9X2Qj_UX?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1zFYCaynyqGWFB9SEbez74V0gJSQSdOtY?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1USSl30_dTS58lEW4ArAoZ4Lp1v-qjVwd?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1-m7AxMI6PLjAK8z_M5fSgBWPg7h-l-zy?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/17a6TcLJyJTAAF6qun_u14YCbBjQltNl5?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1kcZMSkUox4VEl5sYJHPKo5UNBoFj3G8c?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1qH5RHjxsEYMLJHm80_sbEBfeKKvIzQ-K?usp=drive_link");
                }
            }
        });

        // for semester 7
        arrsem7.add("Professional Ethics");
        arrsem7.add("Code of Civil Procedure");
        arrsem7.add("Public International Law");
        arrsem7.add("Summer Internship - II");
        arrsem7.add("Administrative Law");
        arrsem7.add("Law of Property");
        arrsem7.add("Corporate Governance");
        arrsem7.add("Intellectual Property Law");


        ArrayAdapter<String> adpsem7=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem7);
        sem7.setAdapter(adpsem7);

        btn_sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem7.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1LmFgdruNPUlJtaAbFDfVabzrSh6XHb3w?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1T-29ad6s619vR-lReeZN1eqJQwEYBKDa?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1EfOAGtBbZYFasdeEt79nbfgTzGb5bDTA?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1QG7CsemtTpA_WjxwI8cmvkqSHvr_IuBn?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1Mg2gMvFHo04CJPCj884hc02xUQNcxrA3?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1EOKFh4JeRCU4pbAXb-8FPk56w67xuAZh?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/121h1FizoaRZz0x1fR8ZAJn1_26kjkxNx?usp=drive_link");
                }
                else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1daLfMpGjfQN1rGVmQNcxYFkZqqXXs4BA?usp=drive_link");
                }
            }
        });

        // for semester 8
        arrsem8.add("Banking Law");
        arrsem8.add("Indian Federalism");
        arrsem8.add("Private International Law");
        arrsem8.add("Drafting Pleading and Conveyancing");
        arrsem8.add("Environmental Law");
        arrsem8.add("Taxation Law");
        arrsem8.add("Interpretation of Statutes");
        arrsem8.add("Insolvency and Bankruptcy Laws");



        ArrayAdapter<String> adpsem8=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem8);
        sem8.setAdapter(adpsem8);

        btn_sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem8.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/1-7JzHq5kgDarP7qlNTttdfUnxb35cpSN?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1GKa6rB4S_PkhS8EJaHJB3k7CSM6K-ga3?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1Qs5S8Op49P8EYKTHmmsDd1JxGnv-ju_h?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1u-nDygnTQmAnJ2ZIdxPWmdC7Payipitm?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1I2Vy_iD9wPUbmI955V75Ipq8zbWXBm6_?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1OSG4WTZQC2DlOpQftV5POhDm_PAuBVmO?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1qYrd54vskrY3T94H1eYiReGghrY2iAhp?usp=drive_link");
                }
                else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1LK1NCo3bYeaqHxebWLGZbNEopRo-F7OQ?usp=drive_link");
                }
            }
        });


        // for semester 9
        arrsem9.add("Mergers and Acquisitions");
        arrsem9.add("Information Technology Law");
        arrsem9.add("Media and Law");
        arrsem9.add("Summer Internship - III");
        arrsem9.add("Legal Writting");
        arrsem9.add("Insurance Law");
        arrsem9.add("Equity and Trust");
        arrsem9.add("Competition Law");


        ArrayAdapter<String> adpsem9=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem9);
        sem9.setAdapter(adpsem9);

        btn_sem9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=sem9.getSelectedItemPosition();
                if (position==0){
                    goToUrl("https://drive.google.com/drive/folders/11Jrgcl6bKV223k3--3i2ClU2ypQ-9KNK?usp=drive_link");
                }else if (position==1){
                    goToUrl("https://drive.google.com/drive/folders/1xCgWHJeaR0ywiqk9XbDS8oZhRcdY5ddc?usp=drive_link");
                }else if (position==2){
                    goToUrl("https://drive.google.com/drive/folders/1TLwq5QxkWEwaAvtE9DIuTPie0PZmfIhF?usp=drive_link");
                }else if (position==3){
                    goToUrl("https://drive.google.com/drive/folders/1h1UYct1QmBLK3qrjCuUzqBova85k6guD?usp=drive_link");
                }else if (position==4){
                    goToUrl("https://drive.google.com/drive/folders/1HhcMVCSGw9Qsorx4e-PV5wt7gpjwgkDl?usp=drive_link");
                }else if (position==5){
                    goToUrl("https://drive.google.com/drive/folders/1_CHHqad7PGpCkwtCNsxhkz-vzS195z87?usp=drive_link");
                }else if (position==6){
                    goToUrl("https://drive.google.com/drive/folders/1ThuM5NsCa_RVEIVxp72Ob1vlJI-02Mmn?usp=drive_link");
                }
                else if (position==7){
                    goToUrl("https://drive.google.com/drive/folders/1b2Q-fGHwP-tq6FhdLrT3SM8d-1v6imFv?usp=drive_link");
                }
            }
        });


        // for semester 10
        arrsem10.add("Moot Court Internship");
        arrsem10.add("Dissertation");


        ArrayAdapter<String> adpsem10=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrsem10);
        sem10.setAdapter(adpsem10);

        btn_sem10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = sem10.getSelectedItemPosition();
                if (position == 0) {
                    goToUrl("https://drive.google.com/drive/folders/12pyRaLr3955VBGNybMCAQosk8VPFkr74?usp=drive_link");
                } else if (position == 1) {
                    goToUrl("https://drive.google.com/drive/folders/1ioY88Xmg089KNwNPnvMI6cG-V1Thyofe?usp=drive_link");
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