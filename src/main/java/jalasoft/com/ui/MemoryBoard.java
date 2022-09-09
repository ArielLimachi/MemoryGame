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

  JButton about;
  JButton solve;
  JButton newGame;
  List<MemoryCard> buttonCards;
  Container container;

  public MemoryBoard() {
    super(UIConstants.GAME_NAME);
    setLayout(new FlowLayout());
    container = getContentPane();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(150, 150);
    setSize(1200, 150);

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
