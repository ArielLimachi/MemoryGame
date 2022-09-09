package jalasoft.com.behaviors;

import jalasoft.com.models.Board;
import jalasoft.com.models.CardState;
import jalasoft.com.ui.MemoryCard;

public class MemoryBehavior implements GameBehavior {

  char firstSymbol = '-';
  int firstCardId = -1;
  char secondSymbol = '-';
  int secondCardId = -1;

  int clickCounter = 0;

  @Override
  public void performAction(Board board) {
    clickCounter++;
    checkPairSymbols(board);
  }

  public void checkPairSymbols(Board board) {
    setSymbols(board);
    checkSymbols(board);
  }

  public void setSymbols(Board board) {
    if (controlVariablesFilled()) {
      hideMemoryCards(board);
    }
    for (MemoryCard memoryCard : board.getElements()) {
      if (memoryCard.isClicked()) {
        if (firstSymbol == '-') {
          memoryCard.setClicked(false);
          memoryCard.setState(CardState.SHOWN);
          firstSymbol = memoryCard.getSymbol();
          firstCardId = memoryCard.getId();
          break;
        }
        if (secondSymbol == '-' && firstSymbol != '-') {
          memoryCard.setClicked(false);
          memoryCard.setState(CardState.SHOWN);
          secondSymbol = memoryCard.getSymbol();
          secondCardId = memoryCard.getId();
          break;
        }
      }
    }
  }

  public void checkSymbols(Board board) {
    if (firstSymbol != '-' && secondSymbol != '-') {
      if (firstSymbol == secondSymbol) {
        board.getElements().get(firstCardId).setState(CardState.MATCHED);
        board.getElements().get(secondCardId).setState(CardState.MATCHED);
        resetControlVariables();
      } else {
        board.getElements().get(firstCardId).setState(CardState.SHOWN);
        board.getElements().get(secondCardId).setState(CardState.SHOWN);
      }
    }
  }

  public boolean controlVariablesFilled() {
    return firstSymbol != '-' && secondSymbol != '-';
  }

  public void resetControlVariables() {
    firstSymbol = '-';
    secondSymbol = '-';
    firstCardId = -1;
    secondCardId = -1;
  }

  public void hideMemoryCards(Board board) {
    board.getElements().get(firstCardId).setState(CardState.HIDDEN);
    board.getElements().get(secondCardId).setState(CardState.HIDDEN);
    resetControlVariables();
  }
}
