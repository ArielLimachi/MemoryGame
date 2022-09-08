package jalasoft.com.models;

public class Cell<T> {

  private int id;
  private T element;

  public Cell(T item, int id) {
    element = item;
    this.id = id;
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
