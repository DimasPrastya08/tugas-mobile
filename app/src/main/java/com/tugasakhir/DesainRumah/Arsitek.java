package com.tugasakhir.DesainRumah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Arsitek extends AppCompatActivity {
Button kembali_a;
TextView telp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsitek);


        kembali_a = findViewById(R.id.m_kembali);
        kembali_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Arsitek.this, MainActivity.class));
                finish();
            }
        });

        telp = findViewById(R.id.data3_arsitek2);
        telp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0811563168"));
                startActivity(intent);
            }
        });
        TextView arsitek1=(TextView)findViewById(R.id.data2_arsitek1);
        arsitek1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView arsitek2=(TextView)findViewById(R.id.data3_arsitek1);
        arsitek2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView arsitek3=(TextView)findViewById(R.id.data2_arsitek2);
        arsitek3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView arsitek5=(TextView)findViewById(R.id.data2_arsitek3);
        arsitek5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView arsitek6=(TextView)findViewById(R.id.data3_arsitek3);
        arsitek6.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
