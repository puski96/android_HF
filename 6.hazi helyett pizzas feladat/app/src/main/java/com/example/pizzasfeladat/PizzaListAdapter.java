package com.example.pizzasfeladat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PizzaListAdapter extends RecyclerView.Adapter<PizzaListAdapter.VH> {

    private Activity mContext;
    private List<Pizza> mPizza;

    public PizzaListAdapter(Activity context, List<Pizza> pizza) {
        this.mContext = context;
        if(pizza==null){
            throw new IllegalArgumentException("nincs pizza");
        }
        this.mPizza = pizza;
    }


    @Override
    public PizzaListAdapter.VH onCreateViewHolder( ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new VH(itemView,mContext);
    }

    @Override
    public void onBindViewHolder(PizzaListAdapter.VH holder, int position) {
        Pizza pizzak=mPizza.get(position);
        holder.rootView.setTag(pizzak);
        holder.ar.setText(String.valueOf(pizzak.getAr()));
        holder.nev.setText(pizzak.getNev());
        holder.leiras.setText(pizzak.getLeiras());
        holder.image.setImageResource(pizzak.getImage());
    }

    @Override
    public int getItemCount() {
        return mPizza.size();
    }

    public class VH extends RecyclerView.ViewHolder{
        final View rootView;
        final ImageView image;
        final TextView nev;
        final TextView leiras;
        final TextView ar;

        public VH(View itemView, final Context context){
            super(itemView);
            rootView=itemView;
            image=(ImageView)itemView.findViewById(R.id.pizzaKep);
            nev=(TextView)itemView.findViewById(R.id.pizzaNev);
            leiras=(TextView)itemView.findViewById(R.id.pizzaLeiras);
            ar=(TextView)itemView.findViewById(R.id.pizzaAr);

            rootView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Pizza pizza=(Pizza)v.getTag();
                    if(pizza!=null){
                        Intent intent=new Intent(context,PizzaDetails.class);
                        intent.putExtra("PIZZA",pizza);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }

}
