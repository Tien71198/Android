package com.example.baithi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Spinner myspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_list_item_1,
                 getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);

        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            // click vào item nào thì itiem đó hiển thị trên hộp dropdow
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                if (i == 1)
                {
                    startActivity(new Intent(Main2Activity.this, PhongDonActivity.class));
                }
                else
                    if (i == 2)
                    {
                        startActivity(new Intent(Main2Activity.this, PhongDoiActivity.class));
                    }
                else
                    if (i == 3)
                    {
                        startActivity(new Intent(Main2Activity.this, PhongDaActivity.class));
                    }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

/* tạo menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.loaiphong, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this, "Item 1 seleted", Toast.LENGTH_SHORT);
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2 seleted", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item 3 seleted", Toast.LENGTH_SHORT).show();
                return true;
           *//* case R.id.subitem1:
                Toast.makeText(this, "Sub Item 1 seleted", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this, "Sub Item 2 seleted", Toast.LENGTH_SHORT).show();
                return true;*//*
            default:
                return super.onOptionsItemSelected(item);
        }

    }*/
}
