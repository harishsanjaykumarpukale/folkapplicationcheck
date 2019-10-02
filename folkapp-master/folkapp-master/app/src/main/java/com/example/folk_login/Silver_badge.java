package com.example.folk_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Silver_badge extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silver_badge);


        next = findViewById(R.id.btn_next_silver);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Congratulations!! You have completed 70% of your profile and have earned a silver badge.",Toast.LENGTH_LONG).show();
                Intent i = new Intent(Silver_badge.this, Gold_badge.class);
                startActivity(i);
            }
        });
    }
}
