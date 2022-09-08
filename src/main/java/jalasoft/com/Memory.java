package jalasoft.com;

import jalasoft.com.behaviors.GameBehavior;
import jalasoft.com.behaviors.MemoryBehavior;
import jalasoft.com.models.Board;
import jalasoft.com.ui.MemoryBoard;
import jalasoft.com.ui.MemoryCard;
import jalasoft.com.utils.ImageGenerator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Memory implements ActionListener{

  Board board;
  GameBehavior behavior;
  ImageGenerator imageGenerator;

  MemoryBoard memoryBoard;

  public Memory(int w, int h) {
    imageGenerator = new ImageGenerator();
    board = new Board(w, h);
    behavior = new MemoryBehavior();

    memoryBoard = new MemoryBoard();

    setCards();
  }

  public void setCards() {
    int elementsSize = board.getWidth() * board.getHeight();
    for (int i = 0; i < elementsSize; i++) {
      MemoryCard memoryCard = new MemoryCard(i, 0 + (85 * i), 0);
      memoryCard.addActionListener(this);
      memoryBoard.drawButtonCard(memoryCard);
      board.addElement(memoryCard);
    }
  }

  public void performAction() {
    behavior.performAction(board);
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    Object obj = event.getSource();
    MemoryCard button = (MemoryCard) obj;
    System.out.println("...Text -> " + button.getText());
    System.out.println("...id -> " + button.getId());
    System.out.println("...state -> " + button.getState());
    performAction();
  }
}
