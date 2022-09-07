package jalasoft.com.models;

import java.util.List;

public abstract class Board {

  private int width;
  private int height;
  private List<Cell> elements;

  public abstract void initializeElements();

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
