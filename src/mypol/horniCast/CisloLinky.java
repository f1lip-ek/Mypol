package mypol.horniCast;

import mypol.logika.json.Linka.Linka;

import javax.swing.*;
import java.awt.*;

public class CisloLinky extends JPanel {

    private final int delka = 192;
    private final int vyska = 75;

    private JLabel cisloLinky;

    private Linka aktualniLinka;

    public CisloLinky(Linka aktualniLinka) {
        this.aktualniLinka = aktualniLinka;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        setCisloLinky();
    }

    private void setCisloLinky(){
        this.cisloLinky = new JLabel(aktualniLinka.getCisloLinky());
        this.cisloLinky.setBounds(delka/10, 1, delka, vyska);
        this.cisloLinky.setFont(new Font("Arial", Font.BOLD, 90));
        this.cisloLinky.setForeground(new Color(25, 25, 25));
        this.add(cisloLinky);
    }
}
