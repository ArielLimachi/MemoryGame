package jalasoft.com.models;

import jalasoft.com.utils.Coordinate;

public class Cell<T> {

  private Coordinate coordinate;
  private int id;
  private T element;

  public Cell(T item) {
    element = item;
  }

  public Coordinate getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public T getElement() {
    return element;
  }

  public void setElement(T element) {
    this.element = element;
  }
}
