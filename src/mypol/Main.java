package mypol;

import mypol.logika.json.JsonLoad;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyFrame fr = new MyFrame();
        fr.setVisible(true);
        fr.getHorniPanel().getCas().startCas();
    }
}