package com.example.pizzasfeladat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rendel =findViewById(R.id.rendel);
        EditText nev=findViewById(R.id.belepesNev);

        rendel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nev.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Irj be egy nevet", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent= new Intent(getApplicationContext(),PizzaTabs.class);
                    startActivity(intent);
                }
            }
        });
    }
}