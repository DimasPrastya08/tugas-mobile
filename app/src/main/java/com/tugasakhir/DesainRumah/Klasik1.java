package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Klasik1 extends AppCompatActivity {
Button klasikkembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klasik1);

        klasikkembali = findViewById(R.id.klasik_kembali);
        klasikkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Klasik1.this, Klasik.class));
                finish();
            }
        });
    }
}
