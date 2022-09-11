package jalasoft.com.utils;

import java.awt.Dimension;
import javax.swing.JButton;

public class SwingComponentsBuilder {

  public static JButton button(int x, int y, String text, Dimension dimension) {
    JButton button = new JButton(text);
    button.setLocation(x, y);
    button.setSize(dimension);
    return button;
  }

  public static JButton button(String text) {
    JButton button = new JButton(text);
    return button;
  }
}
