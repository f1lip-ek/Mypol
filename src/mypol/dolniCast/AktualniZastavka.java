package mypol.dolniCast;

import mypol.logika.json.Linka.Linka;

import javax.swing.*;
import java.awt.*;

public class AktualniZastavka extends JPanel {

    private final int delka = 798;
    private final int vyska = 128;

    private JLabel zastavka;

    private Linka aktualniLinka;

    public AktualniZastavka(Linka aktualniLinka) {
        this.aktualniLinka = aktualniLinka;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(51, 51, 51));
        this.setLayout(null);
        setCisloLinky();
    }

    private void setCisloLinky(){
        this.zastavka = new JLabel(aktualniLinka.getZastavky().get(aktualniLinka.getIndexZastavky()).getZastavka());
        this.zastavka.setBounds(15, 1, delka, vyska);
        this.zastavka.setFont(new Font("Arial", Font.BOLD, 50));
        this.zastavka.setForeground(new Color(255, 255, 255));
        this.add(zastavka);
    }
}
