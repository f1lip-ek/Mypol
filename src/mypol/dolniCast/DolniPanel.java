package mypol.dolniCast;

import javax.swing.*;
import java.awt.*;

public class DolniPanel extends JPanel {

    private final int delka = 960;
    private final int vyska = 108;


    public DolniPanel(){
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(51, 51, 51));
    }

}
