package com.example.folk_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Gold_badge extends AppCompatActivity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gold_badge);

        submit = findViewById(R.id.btn_submit_gold);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Congratulations!! You have completed 100% of your profile and have earned a gold badge.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
