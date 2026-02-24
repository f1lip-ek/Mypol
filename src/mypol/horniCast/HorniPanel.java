package mypol.horniCast;

import mypol.logika.json.Linka.Linka;

import javax.swing.*;
import java.awt.*;

public class HorniPanel extends JPanel {

    private final int delka = 960;
    private final int vyska = 108;

    private CisloLinky cisloLinky;
    private Destinace destinace;
    private Cas cas;

    private Linka aktualniLinka;

    public HorniPanel(Linka aktualniLinka){
        this.aktualniLinka = aktualniLinka;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(Color.RED);
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        setProperties();
        addPanels();
    }

    private void setProperties(){
        this.cisloLinky = new CisloLinky(aktualniLinka);
        this.destinace = new Destinace(aktualniLinka);
        this.cas = new Cas();
    }

    private void addPanels(){
        this.add(this.cisloLinky);
        this.add(this.destinace);
        this.add(this.cas);
    }

    public Cas getCas() {
        return cas;
    }
}
