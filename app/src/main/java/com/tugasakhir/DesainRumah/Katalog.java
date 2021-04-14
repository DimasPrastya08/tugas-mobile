package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Katalog extends AppCompatActivity {
    Button kembali, modern, minimalis, klasik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);

        kembali = findViewById(R.id.k_kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Katalog.this, MainActivity.class));
                finish();
            }
        });

        modern = findViewById(R.id.btn_modern);
        modern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Katalog.this, Modern.class));
                finish();
            }
        });

        minimalis = findViewById(R.id.btn_minimalis);
        minimalis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Katalog.this, Minimalis.class));
                finish();
            }
        });

        klasik = findViewById(R.id.btn_klasik);
        klasik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Katalog.this, Klasik.class));
                finish();
            }
        });

    }
}
