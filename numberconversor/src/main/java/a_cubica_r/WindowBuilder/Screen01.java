package a_cubica_r.WindowBuilder;

import javax.swing.*;
import a_cubica_r.WindowBuilder.helper_classes.*;
import java.awt.Color;

public class Screen01 {
  private static Screen01 instance;
  private JFrame frame;

  private Screen01() {
    frame = new JFrame("My Awesome Window");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(938, 507);
    frame.setLocationRelativeTo(null); // Center the window
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.decode("#1e1e1e"));

    JLabel lblScreen01_01 = new JLabel("What do you wanna do today?");
    lblScreen01_01.setBounds(134, 51, 672, 101); // Adjusted position
    lblScreen01_01.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 50));
    lblScreen01_01.setForeground(Color.decode("#D9D9D9"));
    panel.add(lblScreen01_01);

    JButton cmdToDecimal = new JButton("Convert a Decimal");
    cmdToDecimal.setBounds(524, 218, 304, 116);
    cmdToDecimal.setBackground(Color.decode("#2e2e2e"));
    cmdToDecimal.setForeground(Color.decode("#D9D9D9"));
    cmdToDecimal.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
    cmdToDecimal.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    cmdToDecimal.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(cmdToDecimal, Color.decode("#232323"), Color.decode("#2e2e2e"));
    cmdToDecimal.addActionListener(e -> {
      Screen03.getInstance().open();
      Screen01.getInstance().close();
    });
    panel.add(cmdToDecimal);

    JButton cmdToIEEE = new JButton("Convert a IEEE");
    cmdToIEEE.setBounds(110, 218, 348, 116);
    cmdToIEEE.setBackground(Color.decode("#2e2e2e"));
    cmdToIEEE.setForeground(Color.decode("#D9D9D9"));
    cmdToIEEE.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
    cmdToIEEE.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    cmdToIEEE.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(cmdToIEEE, Color.decode("#232323"), Color.decode("#2e2e2e"));
    cmdToIEEE.addActionListener(e -> {
      Screen02.getInstance().open();
      Screen01.getInstance().close();
    });
    panel.add(cmdToIEEE);

    frame.add(panel);
  }

  public static Screen01 getInstance() {
    if (instance == null) {
      instance = new Screen01();
    }
    return instance;
  }

  public void open() {
    frame.setVisible(true);
  }

  public void close() {
    frame.setVisible(false);
  }

  public static void main(String[] args) {
    Screen01.getInstance().open();
  }
}