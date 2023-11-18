package Windows;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WindowFrame extends JFrame {
    private static WindowPanel panel;

    public WindowFrame() {
        initialize();
    }

    private void initialize() {
        setTitle("Windows");
        setLocation(0,0);       
        setSize(480*2, 280*2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        panel = new WindowPanel();
        getContentPane().add(panel);

        setVisible(true);
    }

}