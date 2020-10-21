package com.example.hazi3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;

    private final Integer[] imageIDarray;

    private final String[] nameArray;

    private final String[] infoArray;

    private final String[] buyArray;

    private final String[] sellArray;


    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam, String[] sellArrayParam, String[] buyArrayParam){

        super(context, R.layout.listview_row, nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
        this.buyArray = buyArrayParam;
        this.sellArray=sellArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        TextView name=rowView.findViewById(R.id.name);
        TextView info=rowView.findViewById(R.id.description);
        ImageView img=rowView.findViewById(R.id.image);
        TextView sell=rowView.findViewById(R.id.sell);
        TextView buy=rowView.findViewById(R.id.buy);

        name.setText(nameArray[position]);
        info.setText(infoArray[position]);
        img.setImageResource(imageIDarray[position]);
        sell.setText(sellArray[position]);
        buy.setText(buyArray[position]);

        return rowView;

    }
}
