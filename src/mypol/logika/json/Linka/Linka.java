package mypol.logika.json.Linka;

import java.util.ArrayList;

public class Linka {

    private String cisloLinky;
    private String finalniZastavka;
    private ArrayList<Zastavka> zastavky;

    private int indexZastavky = 0;


    public String getCisloLinky() {
        return cisloLinky;
    }

    public String getFinalniZastavka() {
        return finalniZastavka;
    }

    public int getIndexZastavky() {
        return indexZastavky;
    }

    public void setIndexZastavky() {
        this.indexZastavky++;
    }

    public ArrayList<Zastavka> getZastavky() {
        return zastavky;
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
