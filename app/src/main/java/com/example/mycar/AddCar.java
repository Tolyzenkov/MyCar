package com.example.mycar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class AddCar extends AppCompatActivity {

    Spinner brandSpinner, modelSpinner, fuelSpinner;

    ArrayList brandSpinnerArrayList, modelSpinnerArrayList, fuelSpinnerArrayList;

    ArrayAdapter brandSpinnerAdapter, modelSpinnerAdapter, fuelSpinnerAdapter;

    String brand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);

        brandSpinner = (Spinner) findViewById(R.id.spinnerBrand);
        modelSpinner = (Spinner) findViewById(R.id.modelSpinner);
        fuelSpinner = (Spinner) findViewById(R.id.typeOfFuel);

        brandSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                ((TextView)brandSpinner.getChildAt(0)).setTextColor(Color.WHITE);
                ((TextView)brandSpinner.getChildAt(0)).setGravity(Gravity.LEFT);
                ((TextView)brandSpinner.getChildAt(0)).setTextSize(16);
                String selectedBrand = brandSpinner.getSelectedItem().toString();

                switch (selectedBrand) {
                    case "Toyota":
                        modelSpinner.setAdapter(new ArrayAdapter<String>(AddCar.this, android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.ToyotaModels)));
                        break;

                    case "Nissan":
                        modelSpinner.setAdapter(new ArrayAdapter<String>(AddCar.this, android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.NissanModels)));
                        break;

                    case "Honda":
                        modelSpinner.setAdapter(new ArrayAdapter<String>(AddCar.this, android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.HondaModels)));
                        break;
                    case "Subaru":
                        modelSpinner.setAdapter(new ArrayAdapter<String>(AddCar.this, android.R.layout.simple_spinner_dropdown_item,
                                getResources().getStringArray(R.array.SubaruModels)));
                        break;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        modelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void cancel(View view) {
        Intent addCarIntent = new Intent(AddCar.this, MainActivity.class);
        startActivity(addCarIntent);
    }


}
