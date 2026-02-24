package mypol.dolniCast;

import mypol.logika.json.Linka.Linka;

import javax.swing.*;
import java.awt.*;

public class ZastavkaPasmo extends JPanel {

    private final int delka = 162-20;
    private final int vyska = 128;

    private JLabel pasmo;

    private Linka aktualniLinka;

    public ZastavkaPasmo(Linka aktualniLinka) {
        this.aktualniLinka = aktualniLinka;
        this.setPreferredSize(new Dimension(delka, vyska));
        this.setBackground(new Color(51, 51, 51));
        this.setLayout(null);
        setPasmo();
    }

    private void setPasmo(){
        this.pasmo = new JLabel(aktualniLinka.getZastavky().get(aktualniLinka.getIndexZastavky()).getPasmo());
        this.pasmo.setBounds(25, 0, delka, vyska);
        this.pasmo.setFont(new Font("Arial", Font.BOLD, 90));
        this.pasmo.setForeground(new Color(255, 255, 255));
        this.add(pasmo);
    }

}
