package mypol.horniCast;

import mypol.logika.json.Linka.Linka;

import javax.swing.*;
import java.awt.*;

public class Destinace extends JPanel {

    private final int delka = 768;
    private final int vyska = 75;

    private JLabel destinace;

    private Linka aktualniLinka;

    public Destinace(Linka aktualniLinka) {
        this.aktualniLinka = aktualniLinka;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(25, 25, 25));
        this.setLayout(null);
        setDestinace();
    }

    private void setDestinace(){
        this.destinace = new JLabel(aktualniLinka.getFinalniZastavka());
        this.destinace.setBounds(delka/4, 0, delka, vyska);
        this.destinace.setFont(new Font("Arial", Font.BOLD, 60));
        this.destinace.setForeground(Color.WHITE);
        this.add(destinace);
    }

}
