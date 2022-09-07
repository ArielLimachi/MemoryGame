package jalasoft.com;

import jalasoft.com.behaviors.GameBehavior;
import jalasoft.com.behaviors.MemoryBehavior;
import jalasoft.com.models.Board;

public class Memory {

  //private JFrame frame;
  //private Container container;
  Board board;
  GameBehavior behavior;

  public Memory(int w, int h) {
    board = new Board(w, h);
    behavior = new MemoryBehavior();



    //buildUI();
    //initializeElements();

  }

  public void setMemoryCards(){

  }

  /*
  public void initializeElements() {
    List<Cell> elements = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      MemoryCard memoryCard = new MemoryCard(i, "" + i, 0 + (50 * i), 0);
      memoryCard.addActionListener(this);
      frame.add(memoryCard);
      Cell cell = new Cell(memoryCard, i);
      elements.add(cell);
    }
    setElements(elements);
  }

  public void buildUI() {
    frame = new JFrame("Memory");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(null);
    container = frame.getContentPane();
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    JButton button = (JButton) obj;
    System.out.println("Text -> " + button.getText());
  }

   */
}
