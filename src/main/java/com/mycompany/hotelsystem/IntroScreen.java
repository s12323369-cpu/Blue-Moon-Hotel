package com.mycompany.hotelsystem;
import javax.swing.*;
import java.awt.*;


public class IntroScreen extends JFrame {
     public IntroScreen() {
        setTitle("Welcome");
        setSize(600, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel background = new JLabel();

java.net.URL url = getClass().getClassLoader().getResource("images/hotel.png");
if (url == null) {
    System.out.println("❌ الصورة مش موجودة");
} else {
    System.out.println("✅ الصورة موجودة: " + url);
}

ImageIcon icon = new ImageIcon(url);
Image img = icon.getImage().getScaledInstance(600, 650, Image.SCALE_SMOOTH);
background.setIcon(new ImageIcon(img));

        background.setLayout(new BorderLayout());

// عنوان الفندق
JLabel title = new JLabel("Blue Moon Hotel");
title.setFont(new Font("Serif", Font.BOLD, 36));
title.setForeground(Color.WHITE);
title.setHorizontalAlignment(SwingConstants.CENTER);

// شريط علوي
JPanel topPanel = new JPanel();
topPanel.setBackground(new Color(15, 20, 60)); // كحلي
topPanel.setPreferredSize(new Dimension(600, 70));
topPanel.setLayout(new BorderLayout());

topPanel.add(title, BorderLayout.CENTER);

// زر الدخول بالنص
JPanel centerPanel = new JPanel(new GridBagLayout());
centerPanel.setOpaque(false);

JButton enterBtn = new JButton("Enter the Application");
enterBtn.setFont(new Font("Segoe UI", Font.BOLD, 18));
enterBtn.setFocusPainted(false);

enterBtn.addActionListener(e -> {
    new LoginForm().setVisible(true);
    dispose();
});

centerPanel.add(enterBtn);

// توزيع العناصر
background.add(topPanel, BorderLayout.NORTH);
background.add(centerPanel, BorderLayout.CENTER);
        setContentPane(background);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new IntroScreen().setVisible(true);
        });
    }
  
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
