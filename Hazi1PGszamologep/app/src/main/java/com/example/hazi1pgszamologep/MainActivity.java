package com.example.hazi1pgszamologep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1=findViewById(R.id.szam1);
        final EditText szam2=findViewById(R.id.szam2);
        Button osszead=findViewById(R.id.osszeadas);
        Button kivon= findViewById(R.id.kivonas);
        Button szorzas=findViewById(R.id.szorzas);
        Button osztas=findViewById(R.id.osztas);
        final TextView eredmeny= findViewById(R.id.eredmeny);

        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osszeg=Double.parseDouble(szam1.getText().toString())+Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(osszeg));
            }
        });

        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kivonas=Double.parseDouble(szam1.getText().toString())-Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(kivonas));
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double szoroz =Double.parseDouble(szam1.getText().toString())*Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(szoroz));
            }
        });

        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double osztva =Double.parseDouble(szam1.getText().toString())/Double.parseDouble(szam2.getText().toString());
                eredmeny.setText(Double.toString(osztva));
            }
        });

    }
}