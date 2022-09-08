package jalasoft.com.ui;

import jalasoft.com.models.CardState;
import jalasoft.com.utils.ImageGenerator;
import jalasoft.com.utils.UIConstants;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MemoryCard extends JButton {

  int id;
  CardState state;
  ImageIcon icon;

  public MemoryCard(int id, int x, int y) {
    super();
    this.id = id;
    setSize(UIConstants.MEMORY_CARD_WIDTH, UIConstants.MEMORY_CARD_HEIGHT);
    setLocation(x, y);
    setDefaultHiddenState();
  }

  private void setDefaultHiddenState(){
    state = CardState.HIDDEN;
    setIcon(new ImageGenerator().IconFactory(-1));
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

  public ImageIcon getIcon() {
    return icon;
  }

  public void setIcon(ImageIcon icon) {
    this.icon = icon;
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
