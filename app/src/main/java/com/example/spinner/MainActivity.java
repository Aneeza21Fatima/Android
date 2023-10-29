package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Spinner colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = findViewById(R.id.color_spinner);

        ArrayList<String> array=new ArrayList<>();

        array.add("Yellow");
        array.add("black");
        array.add("Pink");
        array.add("orange");
        array.add("blue");
        array.add("red");
        array.add("Green");
        array.add("purple");
        array.add("grey");
        array.add("brown");

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                array
        );

        colors.setAdapter(arrayAdapter);

        colors.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, array.get(i)+" selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}