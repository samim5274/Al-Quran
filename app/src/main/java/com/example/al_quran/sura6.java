package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sura6 extends AppCompatActivity {

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura6);

        back = findViewById(R.id.btnBack6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenBack();
            }
        });
    }
    private void OpenBack(){
        finish();
    }
}