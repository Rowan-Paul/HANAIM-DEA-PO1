package nl.han.oose.dea.pokwaliteit;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        LampView lampView = new LampView();
        DimmerController dimmerController = new DimmerController();
        lampView.getContentPane().add(dimmerController, BorderLayout.SOUTH);
        lampView.validate();
    }
}
