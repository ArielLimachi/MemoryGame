package jalasoft.com.models;

import jalasoft.com.ui.MemoryCard;
import java.util.ArrayList;
import java.util.List;

public class Board {

  private int width;
  private int height;
  private List<MemoryCard> elements;

  public Board(int width, int height) {
    this.width = width;
    this.height = height;
    elements = new ArrayList<>();
  }

  public void addElement(MemoryCard memoryCard) {
    elements.add(memoryCard);
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

  public int getSize() {
    return width * height;
  }

  public List<MemoryCard> getElements() {
    return elements;
  }

  public void setElements(List<MemoryCard> elements) {
    this.elements = elements;
  }
}
