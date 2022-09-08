package jalasoft.com.ui;

import jalasoft.com.models.CustomClickHandler;
import jalasoft.com.utils.UIConstants;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MemoryBoard extends JFrame {

  JButton about;
  JButton solve;
  JButton newGame;
  List<MemoryCard> buttonCards;
  Container container;

  ActionListener clickHandler;

  public MemoryBoard() {
    super(UIConstants.GAME_NAME);
    setLayout(new FlowLayout());
    container = getContentPane();
    container.applyComponentOrientation(
        ComponentOrientation.getOrientation(
            container.getLocale()));

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(150, 150);
    setSize(1200, 150);

    clickHandler = new CustomClickHandler();
    buttonCards = new ArrayList<>();

    setVisible(true);
  }

  public void addButtonCard(MemoryCard memoryCard) {

    buttonCards.add(memoryCard);
    //memoryCard.addActionListener(this);
  }

  public void drawButtonCards() {
    System.out.println("button card size: " + buttonCards.size());
    for (MemoryCard memoryCard : buttonCards) {
      add(memoryCard);
    }
  }

}
