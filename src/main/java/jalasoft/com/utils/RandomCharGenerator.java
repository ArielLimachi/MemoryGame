package jalasoft.com.utils;

import java.util.Random;

public class RandomCharGenerator {

  public static char getChar() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
  }

}
