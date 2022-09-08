package jalasoft.com.behaviors;

import jalasoft.com.models.Board;

public class MemoryBehavior implements GameBehavior{

  @Override
  public void performAction(Board board) {
    System.out.println("logic game goes here");
  }
}
