package jalasoft.com.ui;

import jalasoft.com.models.CardState;
import jalasoft.com.utils.UIConstants;
import java.awt.Font;
import java.util.Objects;
import javax.swing.JButton;

public class MemoryCard extends JButton {

  int id;
  char symbol;
  CardState state;

  public MemoryCard(int id) {
    super();
    this.id = id;
    setSize(UIConstants.MEMORY_CARD_WIDTH, UIConstants.MEMORY_CARD_HEIGHT);
    setDefaultHiddenState();
  }

  private void setDefaultHiddenState(){
    state = CardState.HIDDEN;
    setText(""+'?');
  }

  public void setPosition (int x, int y){
    setLocation(x,y);
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
