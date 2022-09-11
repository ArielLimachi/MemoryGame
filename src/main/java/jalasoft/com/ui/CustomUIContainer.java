package jalasoft.com.ui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class CustomUIContainer extends JPanel {

  public CustomUIContainer(Dimension dimension, Color background) {
    super();
    setBackground(background);
    setSize(dimension);
  }
}
