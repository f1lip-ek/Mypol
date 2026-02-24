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

    private Linka aktualniLinka;


    public DolniPanel(Linka linka){
        this.aktualniLinka = linka;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(51, 51, 51));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        setProperties();
        addPanels();
    }

    private void setProperties(){
        this.pasmo = new ZastavkaPasmo(aktualniLinka);
        this.teplomer = new Teplomer(vyska);
    }

    private void addPanels(){
        this.add(this.pasmo);
        this.add(this.teplomer);
    }

}
