package jalasoft.com.ui;

import jalasoft.com.models.CardState;
import jalasoft.com.utils.UIConstants;
import java.util.Objects;
import javax.swing.JButton;

public class MemoryCard extends JButton {

  int id;
  char symbol;
  CardState state;
  boolean clicked;

  public MemoryCard(int id, String text) {
    super();
    this.id = id;
    this.symbol = text.charAt(0);
    clicked = false;
    setSize(UIConstants.MEMORY_CARD_WIDTH, UIConstants.MEMORY_CARD_HEIGHT);
    setDefaultHiddenState();
  }

  public void setDefaultHiddenState() {
    state = CardState.HIDDEN;
    setText("" + '?');
  }

  public char getSymbol() {
    return symbol;
  }

  public void setSymbol(char symbol) {
    this.symbol = symbol;
  }

  public void setPosition(int x, int y) {
    setLocation(x, y);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public CardState getState() {
    return state;
  }

  public void setState(CardState state) {
    this.state = state;
    switch (state) {
      case HIDDEN:
        setText("" + '?');
        break;
      case SHOWN:
        setText("" + symbol);
        break;
      case MATCHED:
        setEnabled(false);
        break;
    }
  }

  public boolean isClicked() {
    return clicked;
  }

  public void setClicked(boolean clicked) {
    this.clicked = clicked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemoryCard that = (MemoryCard) o;
    return id == that.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
