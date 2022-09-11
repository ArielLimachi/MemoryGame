package jalasoft.com.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

public class UIConstants {

  public static final String MAIN_FRAME_TITLE = "Memory Game by Ariel";
  public static final Point MAIN_FRAME_POSITION = new Point(350, 350);
  public static final int MAIN_FRAME_WIDTH = 600;
  public static final int MAIN_FRAME_HEIGHT = 600;

  public static final Font MEMORY_CARD_FONT = new Font("Arial", Font.PLAIN, 40);
  public static final String MEMORY_CARD_HIDDEN_SYMBOL = "" + '?';
  public static final String MEMORY_CARD_EMPTY_SYMBOL = "";

  public static final Dimension MEMORY_CARD_CONTAINER_SIZE = new Dimension(500, 500);
  public static final Color MEMORY_CARD_CONTAINER_BACKGROUND = Color.GRAY;
  public static final int MEMORY_CARD_CONTAINER_COLUMNS = 5;
  public static final int MEMORY_CARD_CONTAINER_ROWS = 6;
  public static final int MEMORY_CARD_CONTAINER_HORIZONTAL_GAP = 5;
  public static final int MEMORY_CARD_CONTAINER_VERTICAL_GAP = 5;
  public static final Point MEMORY_CARD_CONTAINER_POSITION = new Point(20, 40);

  public static final Dimension CONTROLS_CONTAINER_SIZE = new Dimension(355, 30);
  public static final Color CONTROLS_CONTAINER_BACKGROUND = Color.ORANGE;
  public static final Point CONTROLS_CONTAINER_POSITION = new Point(20, 5);

  public static String ABOUT_CONTROL_NAME = "About";
  public static String SOLVE_CONTROL_NAME = "Solve";
  public static String NEW_GAME_CONTROL_NAME = "New game";
  public static String SAVE_CONTROL_NAME = "Save";
  public static String LOAD_CONTROL_NAME = "Load";

}
