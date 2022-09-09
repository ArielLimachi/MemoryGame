package jalasoft.com;

import jalasoft.com.behaviors.GameBehavior;
import jalasoft.com.behaviors.MemoryBehavior;
import jalasoft.com.models.Board;
import jalasoft.com.ui.MemoryBoard;
import jalasoft.com.ui.MemoryCard;
import jalasoft.com.utils.RandomCharGenerator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Memory implements ActionListener {

  private Board board;
  private GameBehavior behavior;

  private MemoryBoard memoryBoard;

  public Memory(int w, int h) {
    board = new Board(w, h);
    behavior = new MemoryBehavior();
    memoryBoard = new MemoryBoard();
    setCards();
  }

  public void setCards() {
    int elementsSize = board.getWidth() * board.getHeight();
    for (int i = 0; i < elementsSize; i = i + 2) {
      MemoryCard memoryCard = buildMemoryCard(i);
      MemoryCard memoryCardTwo = buildMemoryCard(i + 1, memoryCard.getSymbol());
      memoryBoard.addButtonCard(memoryCard);
      board.addElement(memoryCard);
      memoryBoard.addButtonCard(memoryCardTwo);
      board.addElement(memoryCardTwo);
    }
    memoryBoard.drawButtonCards();
  }

  public MemoryCard buildMemoryCard(int id) {
    char symbol = RandomCharGenerator.getChar();
    MemoryCard memoryCard = new MemoryCard(id, "" + symbol);
    memoryCard.addActionListener(this);
    return memoryCard;
  }

  public MemoryCard buildMemoryCard(int id, char text) {
    MemoryCard memoryCard = new MemoryCard(id, "" + text);
    memoryCard.addActionListener(this);
    return memoryCard;
  }

  public void performAction() {
    behavior.performAction(board);
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    Object obj = event.getSource();
    MemoryCard button = (MemoryCard) obj;
    button.setClicked(true);
    performAction();
  }

  public GameBehavior getBehavior() {
    return behavior;
  }

  public void setBehavior(GameBehavior behavior) {
    this.behavior = behavior;
  }
}
