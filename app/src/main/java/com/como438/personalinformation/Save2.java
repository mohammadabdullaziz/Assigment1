package com.como438.personalinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Save2 extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save2);


        String name = intent.getStringExtra("name");
        TextView textData = findViewById(R.id.naID);
        textData.setText(name);
        String email = intent.getStringExtra("email");
        TextView textem = findViewById(R.id.Emid);
        textData.setText(email);
        String addres = intent.getStringExtra("addres");
        TextView textad = findViewById(R.id.Adid);
        textData.setText(addres);
        String password = intent.getStringExtra("password");
        TextView textpa = findViewById(R.id.Paid);
        textData.setText(password);
        String phon = intent.getStringExtra("phon");
        TextView textph = findViewById(R.id.Paid);
        textData.setText(phon);


        Intent intent =getIntent();



    }
}