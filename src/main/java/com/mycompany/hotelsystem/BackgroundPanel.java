/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelsystem;
import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {

    private Image backgroundImage;

    public BackgroundPanel() {

    java.net.URL url = getClass().getResource("/images/hotel.jpg");

    if (url == null) {
        System.out.println("=؟");
    } else {
        System.out.println("111 " + url);
    }

    backgroundImage = new ImageIcon(url).getImage();
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        if (backgroundImage == null) return;
    }
}
