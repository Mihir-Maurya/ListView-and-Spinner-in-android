package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView citiesName;
private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        citiesName = findViewById(R.id.list);
        spinner = findViewById(R.id.spinner);
//        ArrayList<String> student = new ArrayList<>();
//        student.add("Mohan");
//        student.add("Ram");
//        student.add("Kundan");
//        student.add("Gaurav");
//        student.add("Devilal");
//        ArrayAdapter<String> studentAdapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_spinner_dropdown_item,
//                student);
//        spinner.setAdapter(studentAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,spinner.getSelectedItem().toString() + " Selected" ,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Bhopal");
        cities.add("Pune");
        cities.add("Bangaluru");
        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );
        citiesName.setAdapter(citiesAdapter);
        citiesName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,cities.get(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}