package jalasoft.com.ui;

import jalasoft.com.utils.UIConstants;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MemoryBoard extends JFrame {

  private JButton about;
  private JButton solve;
  private JButton newGame;
  private List<MemoryCard> buttonCards;
  private Container container;

  public MemoryBoard() {
    super(UIConstants.MAIN_FRAME_TITLE);
    setLayout(new FlowLayout());
    container = getContentPane();
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    setLocation(UIConstants.MAIN_FRAME_POSITION);
    setSize(UIConstants.MAIN_FRAME_WIDTH, UIConstants.MAIN_FRAME_HEIGHT);

    buttonCards = new ArrayList<>();

    setVisible(true);
  }

  public void addButtonCard(MemoryCard memoryCard) {
    buttonCards.add(memoryCard);
  }

  public void drawButtonCards() {
    Collections.shuffle(buttonCards);
    for (MemoryCard memoryCard : buttonCards) {
      add(memoryCard);
    }
  }
}
