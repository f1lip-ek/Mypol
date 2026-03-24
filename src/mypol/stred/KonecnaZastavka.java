package mypol.stred;

import javax.swing.*;
import java.awt.*;

public class KonecnaZastavka extends JPanel {

    private final int delka = 960;
    private final int vyska = 304;

    private JLabel konecnaZastavkaCZ;
    private JLabel konecnaZastavkaEN;

    private JPanel panel;

    private GridBagConstraints gbc;

    public KonecnaZastavka() {
        this.gbc = new GridBagConstraints();
        this.setLayout(new GridBagLayout());
        this.setBackground(new Color(25, 25, 25));
        setGbc();
        setText();


    }

    private void setGbc(){
        gbc.gridx = 0; // Vše v jednom sloupci
        gbc.gridy = GridBagConstraints.RELATIVE; // Automaticky pod sebe
        gbc.insets = new Insets(5, 5, 5, 5); // Mezery mezi labely
    }

    private void setText() {
        this.konecnaZastavkaCZ = new JLabel("Konečná zastávka, prosíme, vystupte.");
        this.konecnaZastavkaEN = new JLabel("Final stop, please leave the bus.");

        this.konecnaZastavkaCZ.setFont(new Font("Arial", Font.BOLD, 30));
        this.konecnaZastavkaEN.setFont(new Font("Arial", Font.BOLD, 20));

        this.konecnaZastavkaCZ.setForeground(Color.WHITE);
        this.konecnaZastavkaEN.setForeground(new Color(151, 151, 151));

        this.add(konecnaZastavkaCZ, gbc);
        this.add(konecnaZastavkaEN, gbc);
    }


}
