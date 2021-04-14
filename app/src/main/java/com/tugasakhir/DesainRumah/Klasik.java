package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Klasik extends AppCompatActivity {
    Button kembali3, klasik1, klasik2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klasik);

        kembali3 = findViewById(R.id.m_kembali);
        kembali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Klasik.this, Katalog.class));
                finish();
            }
        });

        klasik1 = findViewById(R.id.btn_klasik1);
        klasik1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Klasik.this, Klasik1.class));
                finish();
            }
        });

        klasik2 = findViewById(R.id.btn_klasik2);
        klasik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Klasik.this, Klasik2.class));
                finish();
            }
        });
    }
}
