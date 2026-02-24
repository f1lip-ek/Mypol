package mypol.stred;

import javax.swing.*;
import java.awt.*;

public class StredovyPanel extends JPanel {

    private final int delka = 960;
    private final int vyska = 324;


    public StredovyPanel(){
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(25, 25, 25));
    }

}
