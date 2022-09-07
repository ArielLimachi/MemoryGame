package jalasoft.com.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

  private int width;
  private int height;
  private List<Cell> elements;

  public Board(int width, int height) {
    this.width = width;
    this.height = height;
    elements = new ArrayList<Cell>();
  }

  public void addElement(Cell element) {
    elements.add(element);
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public List<Cell> getElements() {
    return elements;
  }

  public void setElements(List<Cell> elements) {
    this.elements = elements;
  }
}
