package com.example.project_prm.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import com.example.project_prm.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ConstraintLayout btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, MainActivity.class)));
    }
}