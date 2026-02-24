package mypol.stred;

import mypol.logika.json.Linka.Linka;

import javax.swing.*;
import java.awt.*;

public class StredovyPanel extends JPanel {

    private final int delka = 960;
    private final int vyska = 304;

    private Linka aktualniLinka;


    public StredovyPanel(Linka linka){
        this.aktualniLinka = linka;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(25, 25, 25));
    }

}
