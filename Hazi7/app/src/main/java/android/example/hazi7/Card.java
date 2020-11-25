package android.example.hazi7;

import android.example.hazi7labor.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Card implements Serializable {
    private String currency;
    private String info;
    private int image;
    private String buy;
    private String sell;
    private String buyp;
    private String sellp;

    public Card(String currency, String info, String buy, String sell, int image, String sellp, String buyp) {
        this.currency = currency;
        this.info = info;
        this.sellp = sellp;
        this.buyp = buyp;
        this.sell=sell;
        this.buy=buy;
        this.image=image;
    }

    public String getPenznem() {
        return currency;
    }

    public String getLeiras() {
        return info;
    }

    public int getImage() {
        return image;
    }

    public String getEladasiar() {
        return sellp;
    }

    public String getVasarlasiar() {
        return buyp;
    }

    public static List<Card> getKartya()
    {
        List<Card> kartyaList=new ArrayList<>();
        kartyaList.add(
                new Card("EUR",
                        "EURO",
                        "Cumpar",
                        "Vinde",
                        R.drawable.european_union,
                        "4,5500",
                        "4,4100"
                )
        );
        kartyaList.add(
                new Card("USD",

                        "Dollar",
                        "Cumpar",
                        "Vinde",
                        R.drawable.united_states,
                        "3,9750",
                        "3,9750"

                )
        );
        kartyaList.add(
                new Card("GBP",
                        "Lira sterlina",
                        "Cumpar",
                        "Vinde",
                        R.drawable.united_kingdom,
                        "6,3550",
                        "6,1550"
                )
        );
        kartyaList.add(
                new Card("AUD",
                        "Dolar australian",
                        "Cumpar",
                        "Vinde",
                        R.drawable.australia,
                        "3,0600",
                        "2,9600"
                )
        );
        kartyaList.add(
                new Card("CAD",
                        "Dolar canadian",
                        "Cumpar",
                        "Vinde",
                        R.drawable.canada,
                        "3,2650",
                        "3,0950"
                )
        );
        kartyaList.add(
                new Card("CHF",
                        "France elvetian",
                        "Cumpar",
                        "Vinde",

                        R.drawable.switzerland,
                        "4,3300",
                        "4,2300"
                )
        );
        kartyaList.add(
                new Card("DKK",
                        "Coroana daneza",
                        "Cumpar",
                        "Vinde",
                        R.drawable.denmark,
                        "0,6150" ,
                        "0,5850"));
        kartyaList.add(
                new Card("HUF",
                        "Forint maghiar",
                        "Cumpar",
                        "Vinde",
                        R.drawable.hungary,
                        "0,0146",
                        "0,0136"        ));
        return kartyaList;
    }
}

