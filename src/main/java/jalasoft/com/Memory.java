package jalasoft.com;

import jalasoft.com.behaviors.GameBehavior;
import jalasoft.com.behaviors.MemoryBehavior;
import jalasoft.com.models.Board;
import jalasoft.com.ui.MemoryBoard;
import jalasoft.com.ui.MemoryCard;
import jalasoft.com.utils.RandomCharGenerator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Memory implements ActionListener {

  Board board;
  GameBehavior behavior;

  MemoryBoard memoryBoard;

  public Memory(int w, int h) {
    board = new Board(w, h);
    behavior = new MemoryBehavior();

    memoryBoard = new MemoryBoard();

    setCards();
    //setBoardCards();
  }

  public void setCards() {
    int elementsSize = board.getWidth() * board.getHeight();
    for (int i = 0; i < elementsSize/2; i++) {
      MemoryCard memoryCard = buildMemoryCard(i);
      MemoryCard memoryCardTwo = memoryCard;

      memoryBoard.addButtonCard(memoryCard);
      board.addElement(memoryCard);
    }
    memoryBoard.drawButtonCards();

  }

  public void setBoardCards() {
    int elementsSize = board.getWidth() * board.getHeight();
    for (int i = 0; i < elementsSize / 2; i++) {
      MemoryCard memoryCard = buildMemoryCard(i);
      //memoryBoard.drawButtonCard(memoryCard);
      board.addElement(memoryCard);
    }
    System.out.println("1 -> " + board.getElements().size());

    List<MemoryCard> auxList = board.getElements();
    board.getElements().addAll(auxList);
    System.out.println("2 -> " + board.getElements().size());

    for (int i = 0; i < board.getElements().size(); i++) {
      memoryBoard.addButtonCard(board.getElements().get(i));
    }
    memoryBoard.drawButtonCards();
  }

  public MemoryCard buildMemoryCard(int id) {
    MemoryCard memoryCard = new MemoryCard(id);
    memoryCard.addActionListener(this);
    memoryCard.setText("" + RandomCharGenerator.getChar());
    return memoryCard;
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
