package com.example.pizzasfeladat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class PizzaDetails extends AppCompatActivity {

    public static final String PIZZA="PIZZA";
    private Pizza pizza;
    private ImageView kep;
    private TextView nev;
    private RadioGroup meretek;
    private RadioButton kicsi;
    private RadioButton kozepes;
    private RadioButton nagy;
    private TextView kicsiAr;
    private TextView nagyAr;
    private TextView kozepesAr;
    private CheckBox gomba;
    private CheckBox sonka;
    private CheckBox kolbasz;
    private TextView gombaAr;
    private TextView sonkaAr;
    private TextView kolbaszAr;
    private TextView osszesen;
    private Button megrendel;
    private int ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_details);

        kep = (ImageView) findViewById(R.id.pizzakep2);
        nev = (TextView) findViewById(R.id.pizzaDNev);
        kicsiAr = (TextView) findViewById(R.id.kicsiAr);
        kozepesAr = (TextView) findViewById(R.id.kozepesAr);
        nagyAr = (TextView) findViewById(R.id.nagyAr);
        meretek = (RadioGroup) findViewById(R.id.meretek);
        kicsi = (RadioButton) findViewById(R.id.kicsi);
        kozepes = (RadioButton) findViewById(R.id.kozepes);
        nagy = (RadioButton) findViewById(R.id.nagy);
        gomba = (CheckBox) findViewById(R.id.gomba);
        sonka = (CheckBox) findViewById(R.id.sonka);
        kolbasz = (CheckBox) findViewById(R.id.kolbasz);
        gombaAr = (TextView) findViewById(R.id.gombaAr);
        sonkaAr= (TextView) findViewById(R.id.sonkaAr);
        kolbaszAr= (TextView) findViewById(R.id.kolbaszAr);
        osszesen = (TextView) findViewById(R.id.osszesen);
        megrendel = (Button) findViewById(R.id.rendeles);

        NumberFormat nf=NumberFormat.getNumberInstance();
        pizza=(Pizza)getIntent().getExtras().getSerializable("PIZZA");

        kep.setImageResource(pizza.getImage());
        nev.setText(pizza.getNev());
        kicsiAr.setText(nf.format(pizza.getKicsiAr()));
        kozepesAr.setText(nf.format(pizza.getKozepesAr()));
        nagyAr.setText(nf.format(pizza.getNagyAr()));
        kicsi.setText(pizza.getKicsi());
        kozepes.setText(pizza.getKozepes());
        nagy.setText(pizza.getNagy());
        gomba.setText(pizza.getGomba());
        sonka.setText(pizza.getSonka());
        kolbasz.setText(pizza.getKolbasz());
        gombaAr.setText(nf.format(pizza.getGombaAr()));
        sonkaAr.setText(nf.format(pizza.getSonkaAr()));
        kolbaszAr.setText(nf.format(pizza.getKolbaszAr()));

        meretek.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(kicsi.isChecked()){
                    ar=pizza.getKicsiAr();
                    gomba.setChecked(false);
                    sonka.setChecked(false);
                    kolbasz.setChecked(false);
                    osszesen.setText(nf.format(pizza.getKicsiAr()));
                }
                else if(kozepes.isChecked()){
                    ar=pizza.getKozepesAr();
                    gomba.setChecked(false);
                    sonka.setChecked(false);
                    kolbasz.setChecked(false);
                    osszesen.setText(nf.format(pizza.getKozepesAr()));
                }
                else{
                    ar=pizza.getNagyAr();
                    gomba.setChecked(false);
                    sonka.setChecked(false);
                    kolbasz.setChecked(false);
                    osszesen.setText(nf.format(pizza.getNagyAr()));
                }

            }
        });


        gomba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gomba.isChecked()){
                    int gAr=pizza.getGombaAr();
                    ar=ar+gAr;
                    osszesen.setText(nf.format(ar));
                }
                else{
                    int gAr=pizza.getGombaAr();
                    ar=ar-gAr;
                    osszesen.setText(nf.format(ar));
                }
            }
        });
        sonka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonka.isChecked()){
                    int sAr=pizza.getSonkaAr();
                    ar=ar+sAr;
                    osszesen.setText(nf.format(ar));
                }
                else{
                    int sAr=pizza.getSonkaAr();
                    ar=ar-sAr;
                    osszesen.setText(nf.format(ar));
                }
            }
        });
        kolbasz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kolbasz.isChecked()){
                    int kAr=pizza.getKolbaszAr();
                    ar=ar+kAr;
                    osszesen.setText(nf.format(ar));
                }
                else{
                    int kAr=pizza.getKolbaszAr();
                    ar=ar-kAr;
                    osszesen.setText(nf.format(ar));
                }
            }
        });

        megrendel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(meretek.getCheckedRadioButtonId()==-1){
                    Toast.makeText(PizzaDetails.this, "Valaszd ki a pizzat", Toast.LENGTH_LONG).show();
                }
                else{
                        Intent intent=new Intent(PizzaDetails.this,fragment2.class);
                        intent.putExtra("PIZZA",pizza);
                        startActivity(intent);
                    }
                }

        });
    }
}