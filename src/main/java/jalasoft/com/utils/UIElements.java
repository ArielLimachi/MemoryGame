package jalasoft.com.utils;

import javax.swing.JButton;

public class UIElements {

  public JButton button(int w, int h, int x, int y, String text) {
    JButton button = new JButton(text);
    button.setSize(w, h);
    button.setLocation(x, y);
    return button;
  }

}
