package jalasoft.com.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MemoryBoard extends JFrame implements ActionListener {

  JButton about;
  JButton solve;
  JButton newGame;
  List<JButton> buttonCards;

  Container container;

  public MemoryBoard() {
    super("Memory Game by Ariel");

    container = getContentPane();
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(50,50);
    setSize(600,500);
    //setBackground(Color.magenta);

    buttonCards = new ArrayList<>();
    drawButtonCards();

    setVisible(true);
  }

  public void drawButtonCards(){
    for (int i = 0; i < 10; i++) {
      MemoryCard memoryCard = new MemoryCard(i, "" + i, 0 + (50 * i), 0);
      memoryCard.addActionListener(this);
      buttonCards.add(memoryCard);
      add(memoryCard);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }
}
