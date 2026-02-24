package mypol.stred;

import javax.swing.*;
import java.awt.*;

public class Teplomer extends JPanel {

    private final int delka = 20;
    private int vyska;


    public Teplomer(int velikost) {
        this.vyska = velikost;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(Color.WHITE);
        this.setLayout(null);
    }
}
