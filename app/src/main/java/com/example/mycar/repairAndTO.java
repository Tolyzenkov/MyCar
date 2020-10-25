package com.example.mycar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class repairAndTO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair_and_t_o);
    }

    public void cancel(View view) {
        Intent cancel = new Intent(repairAndTO.this, MainActivity.class);
        startActivity(cancel);
    }
}