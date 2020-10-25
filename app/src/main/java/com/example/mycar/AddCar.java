package com.example.mycar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class AddCar extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    ArrayList spinnerArrayList;
    ArrayAdapter spinnerAdapter;
    String brand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);

        createBrandSpinner();

    }

    public void cancel (View view) {
        Intent addCarIntent = new Intent(AddCar.this, MainActivity.class);
        startActivity(addCarIntent);
    }

    void createBrandSpinner() {
        spinner = findViewById(R.id.spinnerBrand);
        spinner.setOnItemSelectedListener(this);
        spinnerArrayList = new ArrayList();
        spinnerArrayList.add("Марка");
        spinnerArrayList.add("Toyota");
        spinnerArrayList.add("Nissan");
        spinnerArrayList.add("Subaru");
        spinnerArrayList.add("Honda");

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArrayList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

    }




    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        ((TextView)spinner.getChildAt(0)).setTextColor(Color.WHITE);
        ((TextView)spinner.getChildAt(0)).setGravity(Gravity.CENTER_HORIZONTAL);
        ((TextView)spinner.getChildAt(0)).setTextSize(16);
        brand = spinner.getSelectedItem().toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}