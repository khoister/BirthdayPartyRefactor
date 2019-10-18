package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Color;

public class BalloonColor extends Balloon {
  // Color of balloon
  private final Color color;

  public BalloonColor(final Balloon baseBalloon, final Color color) {
    super(baseBalloon);
    this.color = color;
  }

  @Override
  public String getDescription() {
    return color.toString();
  }
}

