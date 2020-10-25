package com.example.mycar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Car car = null;
    }

    public void carInfo(View view) {

    Intent infoIntent = new Intent(MainActivity.this, CarInfo.class );
    startActivity(infoIntent);
    }

    public void fuel(View view) {

        Intent fuelIntent = new Intent(MainActivity.this, Fuel.class );
        startActivity(fuelIntent);
    }

    public void repair(View view) {
        Intent repairIntent = new Intent(MainActivity.this, repairAndTO.class );
        startActivity(repairIntent);
    }

    public void parts(View view) {
        Intent repairIntent = new Intent(MainActivity.this, Repair.class );
        startActivity(repairIntent);
    }

    public void other(View view) {
        Intent otherIntent = new Intent(MainActivity.this, Repair.class );
        startActivity(otherIntent);
    }

    public void addCar(View view) {
        Intent addCarIntent = new Intent(MainActivity.this, AddCar.class );
        startActivity(addCarIntent);
    }
}