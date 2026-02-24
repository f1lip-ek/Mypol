package mypol.horniCast;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Cas extends JPanel {

    private final int delka = 192;
    private final int vyska = 33;

    private JLabel cas;

    public Cas() {
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(100, 100, 100));
        this.setLayout(null);
        setCas();
    }

    private void setCas(){
        this.cas = new JLabel("00:00");
        this.cas.setBounds((delka/7)*2, 0, delka, vyska);
        this.cas.setFont(new Font("Arial", Font.BOLD, 30));
        this.cas.setForeground(new Color(255, 255, 255));
        this.add(this.cas);
    }

    public void startCas(){
        while(true) {
            try{
                LocalTime now = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss");
                DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("H:mm");
                String casTextVteriny = now.format(formatter);
                String casText = now.format(formatter2);
                System.out.println(casTextVteriny);
                cas.setText(casText);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
