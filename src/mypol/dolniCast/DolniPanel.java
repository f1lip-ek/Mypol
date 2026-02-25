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
        this.add(pristiZastavka, "panel1");
        this.add(tatoZastavka, "panel2");
        this.layout.show(this, "panel1");
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

}
