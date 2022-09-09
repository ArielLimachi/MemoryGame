package jalasoft.com.behaviors;

import jalasoft.com.models.Board;
import jalasoft.com.models.CardState;
import jalasoft.com.ui.MemoryCard;
import jalasoft.com.utils.Constants;

public class MemoryBehavior implements GameBehavior {

  private char firstSymbol = Constants.EMPTY_SYMBOL;
  private int firstCardId = Constants.NULL_ID;
  private char secondSymbol = Constants.EMPTY_SYMBOL;
  private int secondCardId = Constants.NULL_ID;

  private int clickCounter = Constants.CLICK_INITIAL_VALUE;

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
        if (firstSymbol == Constants.EMPTY_SYMBOL) {
          memoryCard.setClicked(false);
          memoryCard.setState(CardState.SHOWN);
          firstSymbol = memoryCard.getSymbol();
          firstCardId = memoryCard.getId();
          break;
        }
        if (secondSymbol == Constants.EMPTY_SYMBOL && firstSymbol != Constants.EMPTY_SYMBOL) {
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
    if (firstSymbol != Constants.EMPTY_SYMBOL && secondSymbol != Constants.EMPTY_SYMBOL) {
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
    return firstSymbol != Constants.EMPTY_SYMBOL && secondSymbol != Constants.EMPTY_SYMBOL;
  }

  public void resetControlVariables() {
    firstSymbol = Constants.EMPTY_SYMBOL;
    secondSymbol = Constants.EMPTY_SYMBOL;
    firstCardId = Constants.NULL_ID;
    secondCardId = Constants.NULL_ID;
  }

  public void hideMemoryCards(Board board) {
    board.getElements().get(firstCardId).setState(CardState.HIDDEN);
    board.getElements().get(secondCardId).setState(CardState.HIDDEN);
    resetControlVariables();
  }
}
