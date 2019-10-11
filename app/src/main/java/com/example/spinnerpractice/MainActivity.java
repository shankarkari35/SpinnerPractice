package com.example.spinnerpractice;

import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String[] SilectOprations = { "calculeter", "slideshow", "imageview", "operations",};
    Spinner spin;
    TextView textView;
String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin=findViewById(R.id.spinner);
        textView=findViewById(R.id.textView);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                value=(String)parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //Creating the ArrayAdapter instance having the navigation option  list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,SilectOprations);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner

        spin.setAdapter(aa);                    Toast.makeText(this, value+"", Toast.LENGTH_SHORT).show();

    }
    //Performing action onItemSelected and onNothing selected
}



