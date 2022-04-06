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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suralist);

        btnBack = (Button) findViewById(R.id.txtBack1);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity();
            }
        });

        sura1 = findViewById(R.id.btnS001);
        sura1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSura1();
            }
        });


    }

    private void OpenSura1(){
        Intent intent = new Intent(suralist.this, sura1.class);
        startActivity(intent);
    }

    private void OpenActivity(){
        Intent intent = new Intent(suralist.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}