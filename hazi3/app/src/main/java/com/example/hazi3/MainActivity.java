package com.example.hazi3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"CAD","CHF","CZK","EUR",
            "GBP","HUF","MDL","PLN","SEK","USD" };

    String[] infoArray = {
            "Kanadai dollar",
            "Svajci frank",
            "Cseh korona",
            "Euro",
            "Angol font",
            "Forint",
            "Moldvai lej",
            "Lengyel zloty",
            "Sved korona",
            "Amerikai dollar"
    };

    Integer[] imageArray = {R.drawable.cadi,
            R.drawable.chfi,
            R.drawable.czki,
            R.drawable.eur,
            R.drawable.gbp,
            R.drawable.huf,
            R.drawable.mdl,
            R.drawable.pln,
            R.drawable.sek,
            R.drawable.usd,
    };
    String[] sellArray ={
            "3.1337","4.5467","0.1790","4.8738","5.3552","0.0133","0.2436","1.0655","0.4689","4.1289"
    };
    String[] buyArray ={
            "3.0450","4.4750","0.1700","4.8100","5.2250","0.0130","0.2300","1.0400","0.4500","4.0300"
    };
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter whatever=new CustomListAdapter(this,nameArray,infoArray,imageArray, sellArray, buyArray);
        listView=findViewById(R.id.listviewID);
        listView.setAdapter(whatever);
        //ToDo

//    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//            Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();
//            Intent intent =new Intent(MainActivity.this, detail_activity.class);
//            String message=nameArray[position];
//            intent.putExtra("animal",message);
//
////            Intent intent2 =new Intent(MainActivity.this, detail_activity.class);
//            Integer img=imageArray[position];
//            intent.putExtra("img",img);
//
//            String info=infoArray[position];
//            intent.putExtra("info",info);
//
//            String  age= sellArray[position];
//            intent.putExtra("age",age);
//            startActivity(intent);
////            startActivity(intent2);
//        }
//    });

    }
}
