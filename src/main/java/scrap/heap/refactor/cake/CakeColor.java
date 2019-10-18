package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Color;

public class CakeColor extends Cake {
  // Color of cake
  private final Color color;

  public CakeColor(final Cake baseCake, final Color color) {
    super(baseCake);
    this.color = color;
  }

  @Override
  public String getDescription() {
    return color.toString();
  }
}

