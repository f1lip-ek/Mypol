package mypol.tlacitka;

import mypol.dolniCast.DolniPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTlacitka extends JPanel {

    private JButton zmenaZastavky;
    private JButton vypnout;

    private boolean[] pocetStisknuti = new boolean[2];

    private DolniPanel dolniPanel;

    public PanelTlacitka(DolniPanel dolniPanel){
        this.dolniPanel = dolniPanel;
        this.setPreferredSize(new Dimension(960, 60));
        this.setBackground(Color.BLACK);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        setButton();
        addButtons();
        act();
    }

    private void setButton(){
        this.zmenaZastavky = new JButton("Změna zastávky");
        this.vypnout = new JButton("Vypnout");

        pocetStisknuti[0] = false;
    }

    private void addButtons(){
        this.add(this.zmenaZastavky);
        this.add(this.vypnout);
    }

    private void act(){
        this.zmenaZastavky.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pocetStisknuti[0]){
                    try {
                        dolniPanel.showL("pristiZastavka");
                        System.out.println(dolniPanel.getAktualniLinka().getZastavky().get(dolniPanel.getAktualniLinka().getIndexZastavky()).getZastavka());
                        pocetStisknuti[0] = false;
                    } catch (ArrayIndexOutOfBoundsException ex) {

                    }
                } else {
                    dolniPanel.showL("tatoZastavka");
                    pocetStisknuti[0] = true;
                }
            }
        });
        this.vypnout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
