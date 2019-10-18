package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Shape;

public class CakeShape extends Cake {
  // Shape of cake
  private final Shape shape;

  public CakeShape(final Cake baseCake, final Shape shape) {
    super(baseCake);
    this.shape = shape;
  }

  @Override
  public String getDescription() {
    return shape.toString();
  }
}

