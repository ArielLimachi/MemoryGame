package jalasoft.com.ui;

import jalasoft.com.utils.LayoutBuilder;
import jalasoft.com.utils.SwingComponentsBuilder;
import jalasoft.com.utils.UIConstants;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MemoryBoard extends JFrame {

  CustomUIContainer memoryCardsContainer;
  CustomUIContainer controlsContainer;

  private JButton about;
  private JButton solve;
  private JButton newGame;
  private JButton save;
  private JButton load;
  private List<MemoryCard> buttonCards;
  private Container container;

  public MemoryBoard() {
    super(UIConstants.MAIN_FRAME_TITLE);
    buttonCards = new ArrayList<>();
    setFrameProperties();
    buildMemoryCardContainer();
    buildControlsContainer();
    setVisible(true);
  }

  public void addButtonCard(MemoryCard memoryCard) {
    buttonCards.add(memoryCard);
  }

  public void drawButtonCards() {
    shuffleMemoryCards();
    for (MemoryCard memoryCard : buttonCards) {
      memoryCardsContainer.add(memoryCard);
    }
  }

  public void shuffleMemoryCards() {
    Collections.shuffle(buttonCards);
  }

  public void setFrameProperties() {
    setLayout(null);
    container = getContentPane();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(UIConstants.MAIN_FRAME_POSITION);
    setSize(UIConstants.MAIN_FRAME_WIDTH, UIConstants.MAIN_FRAME_HEIGHT);
  }

  public void buildMemoryCardContainer() {
    memoryCardsContainer = new CustomUIContainer(UIConstants.MEMORY_CARD_CONTAINER_SIZE,
        UIConstants.MEMORY_CARD_CONTAINER_BACKGROUND);
    memoryCardsContainer.setLayout(
        LayoutBuilder.getGridLayout(UIConstants.MEMORY_CARD_CONTAINER_ROWS,
            UIConstants.MEMORY_CARD_CONTAINER_COLUMNS,
            UIConstants.MEMORY_CARD_CONTAINER_HORIZONTAL_GAP,
            UIConstants.MEMORY_CARD_CONTAINER_VERTICAL_GAP));
    memoryCardsContainer.setLocation(UIConstants.MEMORY_CARD_CONTAINER_POSITION);
    add(memoryCardsContainer);
  }

  public void buildControlsContainer() {
    controlsContainer = new CustomUIContainer(UIConstants.CONTROLS_CONTAINER_SIZE,
        UIConstants.CONTROLS_CONTAINER_BACKGROUND);
    controlsContainer.setLayout(LayoutBuilder.getBoxLayout(controlsContainer));
    controlsContainer.setLocation(UIConstants.CONTROLS_CONTAINER_POSITION);
    about = SwingComponentsBuilder.button(UIConstants.ABOUT_CONTROL_NAME);
    solve = SwingComponentsBuilder.button(UIConstants.SOLVE_CONTROL_NAME);
    newGame = SwingComponentsBuilder.button(UIConstants.NEW_GAME_CONTROL_NAME);
    save = SwingComponentsBuilder.button(UIConstants.SAVE_CONTROL_NAME);
    load = SwingComponentsBuilder.button(UIConstants.LOAD_CONTROL_NAME);
    controlsContainer.add(about);
    controlsContainer.add(solve);
    controlsContainer.add(newGame);
    controlsContainer.add(save);
    controlsContainer.add(load);
    add(controlsContainer);
  }
}
