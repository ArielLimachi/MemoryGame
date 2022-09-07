package jalasoft.com.ui;

import jalasoft.com.behaviors.Matcher;
import jalasoft.com.behaviors.PairMatcher;
import jalasoft.com.models.Board;
import jalasoft.com.models.Cell;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MemoryBoard extends Board implements ActionListener {

  private JFrame frame;
  private Container container;
  Matcher matchBehavior;

  public MemoryBoard(int h, int w) {
    setHeight(h);
    setWidth(w);
    matchBehavior = new PairMatcher();

    buildUI();
    initializeElements();

  }

  @Override
  public void initializeElements() {
    List<Cell> elements = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Cell cell = new Cell(button(50, 50, 0 + (50 * i), 0, "" + i));
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

  public JButton button(int w, int h, int x, int y, String text) {
    JButton button = new JButton(text);
    button.setSize(w, h);
    button.setLocation(x, y);
    frame.add(button);
    button.addActionListener(this);
    return button;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    JButton button = (JButton) obj;
    System.out.println("Text -> " + button.getText());
  }
}
