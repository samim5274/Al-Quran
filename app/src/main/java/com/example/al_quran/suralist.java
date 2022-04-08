package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class suralist extends AppCompatActivity {

    private TextView btnBack;
    private Button sura1;
    private Button sura2;
    private Button sura3;
    private Button sura4;
    private Button sura5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suralist);

        btnBack = (Button) findViewById(R.id.txtBack1);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        sura1 = findViewById(R.id.btnS001);
        sura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(suralist.this, sura1.class);
                startActivity(intent);
            }
        });

        sura2 = findViewById(R.id.btnS002);
        sura2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(suralist.this,sura2.class);
                startActivity(intent);
            }
        });

        sura3 = findViewById(R.id.btnS003);
        sura3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(suralist.this,sura3.class);
                startActivity(intent);
            }
        });

        sura4 = findViewById(R.id.btnS004);
        sura4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(suralist.this,sura4.class);
                startActivity(intent);
            }
        });

        sura5 = findViewById(R.id.btnS005);
        sura5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(suralist.this,sura5.class);
                startActivity(intent);
            }
        });


    }

}













