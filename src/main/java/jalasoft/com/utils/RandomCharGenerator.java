package jalasoft.com.utils;

import java.util.Random;

public class RandomCharGenerator {

  public static char getChar() {
    Random r = new Random();
    return (char) (r.nextInt(Constants.INITIAL_VALUE_FOR_LETTER_GENERATOR)
        + Constants.LOWERCASE_A_CHARACTER);
  }

}
