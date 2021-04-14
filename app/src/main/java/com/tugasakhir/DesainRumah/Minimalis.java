package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Minimalis extends AppCompatActivity {
    Button kembali4, mini1, mini2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minimalis);

        kembali4 = findViewById(R.id.m_kembali);
        kembali4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Minimalis.this, Katalog.class));
                finish();
            }
        });

        mini1 = findViewById(R.id.btn_minimalis1);
        mini1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Minimalis.this, Mini1.class));
                finish();
            }
        });

        mini2 = findViewById(R.id.btn_minimalis2);
        mini2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Minimalis.this, Mini2.class));
                finish();
            }
        });
    }
}
