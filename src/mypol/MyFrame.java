package mypol;

import mypol.dolniCast.DolniPanel;
import mypol.horniCast.HorniPanel;
import mypol.logika.json.JsonLoad;
import mypol.stred.StredovyPanel;
import mypol.tlacitka.PanelTlacitka;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private DolniPanel dolniPanel;
    private HorniPanel horniPanel;
    private StredovyPanel stredovyPanel;

    private JPanel panel;
    private PanelTlacitka tlacitka;

    private JsonLoad jsonLoader;

    public MyFrame(String nazevSouboru){
        this.jsonLoader = JsonLoad.loadGameDataFromResources("linky/" + nazevSouboru);
        setProperties();
        this.setTitle("MyPol");
        this.setSize(960, 608);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.setResizable(false);
        setPanel();
        //this.pack();
    }

    private void setProperties(){
        this.dolniPanel = new DolniPanel(jsonLoader.getLinka());
        this.horniPanel = new HorniPanel(jsonLoader.getLinka());
        this.stredovyPanel = new StredovyPanel(jsonLoader.getLinka());
        this.panel = new JPanel();
        this.tlacitka = new PanelTlacitka(dolniPanel);
    }

    private void setPanel(){
        this.panel.setPreferredSize(new Dimension(960, 540));
        this.panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        addPanels();
        this.add(this.panel);
        this.add(this.tlacitka);
    }

    private void addPanels(){
        this.panel.add(this.horniPanel);
        this.panel.add(this.stredovyPanel);
        this.panel.add(this.dolniPanel);

    }

    public HorniPanel getHorniPanel() {
        return horniPanel;
    }
}
