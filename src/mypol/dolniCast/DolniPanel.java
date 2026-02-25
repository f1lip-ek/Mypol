package mypol.dolniCast;

import mypol.logika.json.Linka.Linka;
import mypol.stred.Teplomer;

import javax.swing.*;
import java.awt.*;

public class DolniPanel extends JPanel {

    private final int delka = 960;
    private final int vyska = 128;

    private ZastavkaPasmo pasmo;
    private Teplomer teplomer;
    private AktualniZastavka aktualniZastavka;

    private ZastavkaPasmo zastavkaPasmo;
    private Teplomer zastavkaTeplomer;
    private AktualniZastavka zastavkaTed;

    private Linka aktualniLinka;

    private JPanel pristiZastavka;
    private JPanel tatoZastavka;

    private CardLayout layout;


    public DolniPanel(Linka linka){
        this.aktualniLinka = linka;
        this.layout = new CardLayout();

        this.setPreferredSize(new Dimension(delka, vyska));
        this.setForeground(new Color(51, 51, 51));
        this.setLayout(layout);
        setProperties();
        addPanels();
        this.add(pristiZastavka, "pristiZastavka");
        this.add(tatoZastavka, "tatoZastavka");
        this.layout.show(this, "pristiZastavka");
    }

    private void setProperties(){
        this.pristiZastavka = new JPanel();
        this.pristiZastavka.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        this.tatoZastavka = new JPanel();
        this.tatoZastavka.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        this.pasmo = new ZastavkaPasmo(aktualniLinka);
        this.teplomer = new Teplomer(vyska);
        this.aktualniZastavka = new AktualniZastavka(aktualniLinka);

        this.zastavkaPasmo = new ZastavkaPasmo(aktualniLinka);
        this.zastavkaTeplomer = new Teplomer(vyska);
        this.zastavkaTed = new AktualniZastavka(aktualniLinka);

        this.zastavkaPasmo.setColor(false);
        this.zastavkaTed.setColor(false);
    }

    private void addPanels(){
        this.pristiZastavka.add(this.pasmo);
        this.pristiZastavka.add(this.teplomer);
        this.pristiZastavka.add(this.aktualniZastavka);

        this.tatoZastavka.add(this.zastavkaPasmo);
        this.tatoZastavka.add(this.zastavkaTeplomer);
        this.tatoZastavka.add(this.zastavkaTed);
    }

    public void showL(String nazev){
        if (nazev.equals("pristiZastavka")){
            aktualniLinka.setIndexZastavky();
            if (aktualniLinka.getIndexZastavky() < aktualniLinka.getZastavky().size()){
                this.pasmo.setText();
                this.aktualniZastavka.setText();
                this.layout.show(this, "pristiZastavka");
            }else{
                throw new ArrayIndexOutOfBoundsException("Neni index");
            }

        }else if (nazev.equals("tatoZastavka")){
            this.zastavkaPasmo.setText();
            this.zastavkaTed.setText();
            this.layout.show(this, "tatoZastavka");
        }
    }

    public CardLayout getLayout() {
        return this.layout;
    }

    public Linka getAktualniLinka() {
        return aktualniLinka;
    }
}
