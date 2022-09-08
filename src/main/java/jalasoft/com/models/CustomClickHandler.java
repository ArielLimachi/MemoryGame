package jalasoft.com.models;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CustomClickHandler implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("A CHILE");
    Object obj = e.getSource();
    JButton button = (JButton)obj;
    System.out.println("Text -> " + button.getText());
  }
}
