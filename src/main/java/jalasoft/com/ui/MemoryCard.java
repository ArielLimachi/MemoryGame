package jalasoft.com.ui;

import jalasoft.com.models.CardState;
import jalasoft.com.utils.UIConstants;
import javax.swing.JButton;

public class MemoryCard extends JButton {

  int id;
  CardState state;
  //ImageIcon icon;

  public MemoryCard(int id, String text, int x, int y) {
    super(text);
    this.id = id;
    setSize(UIConstants.MEMORY_CARD_WIDTH, UIConstants.MEMORY_CARD_HEIGHT);
    setLocation(x, y);
  }
}
