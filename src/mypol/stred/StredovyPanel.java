package mypol.stred;

import mypol.logika.json.Linka.Linka;

import javax.swing.*;
import java.awt.*;

public class StredovyPanel extends JPanel {

    private final int delka = 960;
    private final int vyska = 304;

    private Linka aktualniLinka;

    private CardLayout layout;

    private KonecnaZastavka konecnaZastavka;

    public StredovyPanel(Linka linka){
        this.aktualniLinka = linka;
        this.konecnaZastavka = new KonecnaZastavka();
        this.layout = new CardLayout();

        this.setLayout(layout);
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(25, 25, 25));
        this.add(konecnaZastavka, "konecnaZastavka");
        this.layout.show(this, "konecnaZastavka");
    }

}
