package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mini1 extends AppCompatActivity {
Button minikembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini1);

        minikembali = findViewById(R.id.minikembali);
        minikembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Mini1.this, Minimalis.class));
                finish();
            }
        });
    }
}
