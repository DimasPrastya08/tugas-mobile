package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Berita extends AppCompatActivity {

    Button kembali_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        kembali_b = findViewById(R.id.b_kembali);
        kembali_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Berita.this, MainActivity.class));
                finish();
            }
        });

        TextView berita1=(TextView)findViewById(R.id.berita1);
        berita1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView berita2=(TextView)findViewById(R.id.berita2);
        berita2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView berita3=(TextView)findViewById(R.id.berita3);
        berita3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
