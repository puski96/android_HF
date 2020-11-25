package android.example.hazi7;

import android.app.Activity;
import android.content.Context;
import android.example.hazi7labor.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Card_Adapter extends RecyclerView.Adapter<Card_Adapter.KartyaViewHolder> {
    private Activity mCtx;
    private List<Card> kartyalist;

    public Card_Adapter(Activity mCtx, List<Card> kartyalist) {
        this.mCtx = mCtx;
        this.kartyalist = kartyalist;
    }

    @Override
    public KartyaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        return new KartyaViewHolder(itemView, mCtx);
    }
    @Override
    public void onBindViewHolder(KartyaViewHolder holder, int position) {
        Card card =kartyalist.get(position);
        holder.rootView.setTag(card);
        holder.textView1.setText(card.getPenznem());
        holder.textView2.setText(card.getLeiras());
        holder.textView5.setText(card.getVasarlasiar());
        holder.textView6.setText(card.getEladasiar());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(card.getImage(),null));
    }
    @Override
    public int getItemCount() {
        return kartyalist.size();
    }

    class KartyaViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView1,textView2,textView3,textView4,textView5,textView6;
        View rootView;
        public KartyaViewHolder(View itemView,final Context context) {
            super(itemView);
            rootView=itemView;
            imageView = itemView.findViewById(R.id.imageView);
            textView1 =itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 =itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            textView5 = itemView.findViewById(R.id.textView5);
            textView6 = itemView.findViewById(R.id.textView6);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    textView3.setVisibility(v.VISIBLE);
                    textView4.setVisibility(v.VISIBLE);
                    textView5.setVisibility(v.VISIBLE);
                    textView6.setVisibility(v.VISIBLE);
                }
            });
        }
    }
}

