package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bahan extends AppCompatActivity {
Button bahankembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahan);

        bahankembali = findViewById(R.id.bahankembali);
        bahankembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Bahan.this, MainActivity.class));
                finish();
            }
        });

        TextView bahan1=(TextView)findViewById(R.id.bahan1);
        bahan1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bahan2=(TextView)findViewById(R.id.bahan2);
        bahan2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bahan3=(TextView)findViewById(R.id.bahan3);
        bahan3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bahan4=(TextView)findViewById(R.id.bahan4);
        bahan4.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
