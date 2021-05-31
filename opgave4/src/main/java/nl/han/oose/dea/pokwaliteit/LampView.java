package nl.han.oose.dea.pokwaliteit;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LampView extends JFrame {
    private int lichtSterkte = 0;
    private JLabel jl = new JLabel();

    public LampView() {
        setLocation(500, 500);
        setSize(340, 500);
        setVisible(true);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Maak de container
        Container ctr = this.getContentPane();
        ctr.add(jl, BorderLayout.CENTER);
        setVisible(true);

        // Teken de lamp
        tekenLamp();
    }

    private void tekenLamp() {
        URL fileLoc = ClassLoader.getSystemResource("lampje-" + lichtSterkte + ".png");
        jl.setIcon(new ImageIcon(fileLoc));
        validate();
    }

}
