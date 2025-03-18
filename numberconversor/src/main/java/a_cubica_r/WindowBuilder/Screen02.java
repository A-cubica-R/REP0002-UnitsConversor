package a_cubica_r.WindowBuilder;

import javax.swing.*;
import a_cubica_r.WindowBuilder.helper_classes.*;
import a_cubica_r.model.ArchtypeOperator;
import a_cubica_r.model.NumberGuardian;
import a_cubica_r.model.ParamsCollector;
import java.awt.Color;

public class Screen02 {
  private static Screen02 instance;
  private JFrame frame;

  private Screen02() {
    frame = new JFrame("My Awesome Window");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(938, 507);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.decode("#1e1e1e"));

    JLabel lblScreen02_01 = new JLabel("Enter your DECIMAL number");
    lblScreen02_01.setBounds(229, 47, 479, 80); // Adjusted position
    lblScreen02_01.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 50));
    lblScreen02_01.setForeground(Color.decode("#D9D9D9"));
    panel.add(lblScreen02_01);

    JComboBox<ArchtypeOperator> cmbSelectBase = new JComboBox<>(ArchtypeOperator.values());
    cmbSelectBase.setBounds(56, 188, 368, 55);
    cmbSelectBase.setBackground(Color.decode("#2e2e2e"));
    cmbSelectBase.setForeground(Color.decode("#D9D9D9"));
    cmbSelectBase.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    cmbSelectBase.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    panel.add(cmbSelectBase);

    JTextField fldScreen02_01 = new JTextField("");
    fldScreen02_01.setBounds(54, 132, 830, 28);
    fldScreen02_01.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    fldScreen02_01.setBackground(Color.decode("#B2B2B2"));
    fldScreen02_01.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(fldScreen02_01, "you number", Color.decode("#353535"), Color.decode("#656565"));
    panel.add(fldScreen02_01);

    JTextField fldScreen02_02 = new JTextField("");
    fldScreen02_02.setBounds(54, 275, 106, 21);
    fldScreen02_02.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    fldScreen02_02.setBackground(Color.decode("#B2B2B2"));
    fldScreen02_02.setForeground(Color.decode("#656565"));
    fldScreen02_02.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(fldScreen02_02, "Sign", Color.decode("#353535"), Color.decode("#656565"));
    panel.add(fldScreen02_02);

    JTextField fldScreen02_03 = new JTextField("");
    fldScreen02_03.setBounds(179, 275, 265, 21);
    fldScreen02_03.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    fldScreen02_03.setBackground(Color.decode("#B2B2B2"));
    fldScreen02_03.setForeground(Color.decode("#656565"));
    fldScreen02_03.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(fldScreen02_03, "exponent", Color.decode("#353535"), Color.decode("#656565"));
    panel.add(fldScreen02_03);

    JTextField fldScreen02_04 = new JTextField("");
    fldScreen02_04.setBounds(449, 275, 435, 21);
    fldScreen02_04.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
    fldScreen02_04.setBackground(Color.decode("#B2B2B2"));
    fldScreen02_04.setForeground(Color.decode("#656565"));
    fldScreen02_04.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(fldScreen02_04, "mantissa", Color.decode("#353535"), Color.decode("#656565"));
    panel.add(fldScreen02_04);

    JTextField fldScreen02_05 = new JTextField("");
    fldScreen02_05.setBounds(54, 338, 831, 21);
    fldScreen02_05.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    fldScreen02_05.setBackground(Color.decode("#B2B2B2"));
    fldScreen02_05.setForeground(Color.decode("#656565"));
    fldScreen02_05.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
    OnFocusEventHelper.setOnFocusText(fldScreen02_05, "Your number is...", Color.decode("#353535"),
        Color.decode("#656565"));
    panel.add(fldScreen02_05);

    JButton cmdOperate = new JButton("Operate");
    cmdOperate.setBounds(431, 188, 451, 54);
    cmdOperate.setBackground(Color.decode("#2e2e2e"));
    cmdOperate.setForeground(Color.decode("#D9D9D9"));
    cmdOperate.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 30));
    cmdOperate.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    cmdOperate.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(cmdOperate, Color.decode("#232323"), Color.decode("#2e2e2e"));
    cmdOperate.addActionListener(e -> {
      String number = fldScreen02_01.getText();
      ArchtypeOperator base = (ArchtypeOperator) cmbSelectBase.getSelectedItem();
      String result = NumberGuardian.passDECNumber(number, base);
      fldScreen02_05.setText(result);
      switch (base) {
        case X32 -> {
          fldScreen02_02.setText(ParamsCollector.collectResultX32(result)[0]);
          fldScreen02_03.setText(ParamsCollector.collectResultX32(result)[1]);
          fldScreen02_04.setText(ParamsCollector.collectResultX32(result)[2]);
        }
        case X64 -> {
          fldScreen02_02.setText(ParamsCollector.collectResultX64(result)[0]);
          fldScreen02_03.setText(ParamsCollector.collectResultX64(result)[1]);
          fldScreen02_04.setText(ParamsCollector.collectResultX64(result)[2]);
        }
        default -> {
        }
      }
    });
    panel.add(cmdOperate);

    JButton btnBack = new JButton("Back");
    btnBack.setBounds(54, 400, 100, 30);
    btnBack.setBackground(Color.decode("#2e2e2e"));
    btnBack.setForeground(Color.decode("#D9D9D9"));
    btnBack.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 20));
    btnBack.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
    btnBack.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btnBack, Color.decode("#232323"), Color.decode("#2e2e2e"));
    btnBack.addActionListener(e -> {
        Screen01.getInstance().open();
        Screen02.getInstance().close();
    });
    panel.add(btnBack);

    frame.add(panel);
  }

  public static Screen02 getInstance() {
    if (instance == null) {
      instance = new Screen02();
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
    Screen02.getInstance().open();
  }
}