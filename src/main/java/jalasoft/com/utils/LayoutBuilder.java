package jalasoft.com.utils;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class LayoutBuilder {

  public static LayoutManager getGridLayout(int rows, int cols, int hGap, int vGap) {
    return new GridLayout(rows, cols, hGap, vGap);
  }

  public static LayoutManager getFlowLayout(int align, int hGap, int vGap) {
    return new FlowLayout(align, hGap, vGap);
  }

  public static LayoutManager getBoxLayout(JPanel container) {
    return new BoxLayout(container, BoxLayout.LINE_AXIS);
  }
}
