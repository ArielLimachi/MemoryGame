package jalasoft.com.ui;

import jalasoft.com.models.CustomClickHandler;
import jalasoft.com.utils.UIConstants;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MemoryBoard extends JFrame {

  JButton about;
  JButton solve;
  JButton newGame;
  List<JButton> buttonCards;
  Container container;

  ActionListener clickHandler;

  public MemoryBoard() {
    super(UIConstants.GAME_NAME);

    container = getContentPane();
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(50, 50);
    setSize(900, 500);

    clickHandler = new CustomClickHandler();
    buttonCards = new ArrayList<>();

    setVisible(true);
  }

  public void drawButtonCard(MemoryCard memoryCard) {
    add(memoryCard);
    //memoryCard.addActionListener(this);
  }

  /*
  @Override
  public void actionPerformed(ActionEvent event) {
    Object obj = event.getSource();
    JButton button = (JButton) obj;
    System.out.println("...Text -> " + button.getText());
  }
*/

  public List<JButton> getButtonCards() {
    return buttonCards;
  }

  public void setButtonCards(List<JButton> buttonCards) {
    this.buttonCards = buttonCards;
  }
}
