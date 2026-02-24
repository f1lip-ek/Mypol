package mypol.logika.json.Linka;

public class Zastavka {

    private String zastavka;
    private String pasmo;

    public String getPasmo() {
        return pasmo;
    }

    public String getZastavka() {
        return zastavka;
    }

    @Override
    public String toString() {
        return "Zastavka{" +
                "zastavka='" + zastavka + '\'' +
                ", pasmo='" + pasmo + '\'' +
                '}';
    }
}
