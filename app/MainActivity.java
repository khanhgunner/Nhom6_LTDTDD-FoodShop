package com.foodshop.app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        ArrayList<String> arrayThanhPho = new ArrayList<String>();
        arrayThanhPho.add("Đà Nẵng");
        arrayThanhPho.add("Quảng Trị");
        arrayThanhPho.add("Hà Tĩnh");
        arrayThanhPho.add("Nghệ An");
        arrayThanhPho.add("Hà Nội");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,arrayThanhPho);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

    }
}