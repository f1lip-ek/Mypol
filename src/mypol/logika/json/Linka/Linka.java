package mypol.logika.json.Linka;

import java.util.ArrayList;

public class Linka {

    private String cisloLinky;
    private String finalniZastavka;
    private ArrayList<Zastavka> zastavky;


    public String getCisloLinky() {
        return cisloLinky;
    }

    public String getFinalniZastavka() {
        return finalniZastavka;
    }

    @Override
    public String toString() {
        return "Linka{" +
                "cisloLinky='" + cisloLinky + '\'' +
                ", finalniZastavka='" + finalniZastavka + '\'' +
                ", zastavky=" + zastavky +
                '}';
    }
}
