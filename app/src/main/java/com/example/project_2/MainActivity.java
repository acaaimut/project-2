package com.example.project_2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       editText=findViewById(R.id.editTextPhone);
       radioButton=findViewById(R.id.radioButton);
       radioButton2=findViewById(R.id.radioButton2);
       radioButton3=findViewById(R.id.radioButton3);
    }
    public void showText(View view) {
        String nophone = editText.getText().toString();
        String pilih = "";
        if (radioButton.isChecked()) {
            pilih = "Telepon Rumah";
        } else if (radioButton2.isChecked()) {
            pilih = "Telepon Mobile";
        } else if (radioButton3.isChecked()) {
            pilih = "Telepon Kantor";
        }
        android.widget.Toast.makeText(this, "Nomor: " + nophone + "\nTipe: " + pilih, android.widget.Toast.LENGTH_SHORT).show();
    }
}