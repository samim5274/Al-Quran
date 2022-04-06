package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button suralist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suralist = (Button) findViewById(R.id.btn001);

        suralist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSuraList();
            }
        });
    }

    private void OpenSuraList() {
        Intent intent = new Intent(MainActivity.this,suralist.class);
        startActivity(intent);
    }
}