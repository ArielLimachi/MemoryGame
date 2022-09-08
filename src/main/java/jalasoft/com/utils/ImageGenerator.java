/*
 * The MIT License
 *
 * Copyright 2018 marco.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package jalasoft.com.utils;

import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class ImageGenerator {

  public class Item {

    Integer code;
    String iconName;

    Item(Integer code, String iconName) {
      this.code = code;
      this.iconName = iconName;
    }
  }

  private final Map<Integer, Item> icons;

  public ImageGenerator() {
    icons = new HashMap<>();
    buildIcons();
  }

  public String getResourceName(Integer intCod) {
    return icons.get(intCod).iconName;
  }

  public ImageIcon IconFactory(Integer intCod) {
    if (!icons.containsKey(intCod)) {
      System.out.println("IconFactory problem");
      return null;
    }
    return new ImageIcon(
        getClass()
            .getClassLoader()
            .getResource(getResourceName(intCod)));
  }

  private void buildIcons() {
    Item item;
    int i = -1;

    // undiscovered image
    item = new Item(i++, "images/ic_help_outline_black_18dp.png");
    icons.put(item.code, item);

    // discovered image
    item = new Item(i++, "images/ic_done_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_airport_shuttle_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_all_inclusive_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_beach_access_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_business_center_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_casino_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_child_care_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_child_friendly_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_fitness_center_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_free_breakfast_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_hot_tub_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_kitchen_black_18dp.png");
    icons.put(item.code, item);

    item = new Item(i++, "images/ic_pool_black_18dp.png");
    icons.put(item.code, item);
  }

  public Map<Integer, Item> getItems(){
    return icons;
  }
}
