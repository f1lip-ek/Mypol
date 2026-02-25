package mypol.dolniCast;

import mypol.logika.json.Linka.Linka;

import javax.swing.*;
import java.awt.*;

public class ZastavkaPasmo extends JPanel {

    private final int delka = 162-10;
    private final int vyska = 128;

    private JLabel pasmo;

    private Linka aktualniLinka;

    public ZastavkaPasmo(Linka aktualniLinka) {
        this.aktualniLinka = aktualniLinka;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setLayout(null);
        setPasmo();
        setColor(true);
    }

    private void setPasmo(){
        this.pasmo = new JLabel(aktualniLinka.getZastavky().get(aktualniLinka.getIndexZastavky()).getPasmo());
        this.pasmo.setBounds(110, 0, delka, vyska);
        this.pasmo.setFont(new Font("Arial", Font.BOLD, 35));
        this.add(pasmo);
    }

    public void setColor(boolean gray){
        if(gray){
            this.pasmo.setText(aktualniLinka.getZastavky().get(aktualniLinka.getIndexZastavky()).getPasmo());
            this.setBackground(new Color(51, 51, 51));
            this.pasmo.setForeground(new Color(255, 255, 255));
        }else {
            this.setBackground(new Color(120, 120, 120));
            this.pasmo.setForeground(new Color(23, 23, 23));
        }
    }

}
