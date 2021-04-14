package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Modern extends AppCompatActivity {
Button kembali3, modern1, modern2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modern);

        kembali3 = findViewById(R.id.m_kembali);
        kembali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Modern.this, Katalog.class));
                finish();
            }
        });

        modern1 = findViewById(R.id.btn_modern1);
        modern1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Modern.this, Modern1.class));
                finish();
            }
        });

        modern2 = findViewById(R.id.btn_modern2);
        modern2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Modern.this, Modern2.class));
                finish();
            }
        });

    }
}
