package com.example.folk_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Bronze_badge extends AppCompatActivity {

    TextView tv_dob;
    Button btn_dob, btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bronze_badge);

        tv_dob = findViewById(R.id.dob_display);
        btn_dob = findViewById(R.id.btn_dob);
        btn_next = findViewById(R.id.btn_next);

        String date = getIntent().getStringExtra("date");
        if (date != null){
            tv_dob.setText(date);
        }

        btn_dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Bronze_badge.this, CalendarActivity.class);
                startActivity(i);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Congratulations!! You have completed 30% of your profile and have earned a bronze badge.", Toast.LENGTH_LONG).show();
                Intent i = new Intent(Bronze_badge.this,Silver_badge.class);
                startActivity(i);
            }
        });

    }
}
