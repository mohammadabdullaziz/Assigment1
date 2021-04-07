package com.como438.personalinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner spinner;

private  EditText Naid;
private  EditText Emid;
private  EditText Gaid;
private  EditText Adid;
private  EditText Paid;
private  EditText Phid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.Geid);
        pupulateSpinner();
       Naid = findViewById(R.id.Naid);
       Emid = findViewById(R.id.Emid);
       Paid = findViewById(R.id.Paid);
       Adid = findViewById(R.id.Adid);
       Paid = findViewById(R.id.Paid);



    }

    private void pupulateSpinner() {
        ArrayList<String> data = new ArrayList<>();
        data.add("m");
        data.add("f");
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,data);
        spinner.setAdapter((adapter));
    }

    public void on_Clik(View view) {
        Intent intent = new Intent(this,Save2.class);
        String data = Naid.getText().toString();
        String emile = Emid.getText().toString();
        String addres = Adid.getText().toString();
        String password = Paid.getText().toString();
        String phon = Phid.getText().toString();
        String gender = Gaid.getText().toString();


        intent.putExtra("data",data);
       intent .putExtra("data",emile);
        intent .putExtra("data",addres);
        intent .putExtra("data",password);
        intent .putExtra("data",gender);
        intent .putExtra("data",phon);


        startActivity(intent);


    }
}