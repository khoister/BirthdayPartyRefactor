package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Size;

public class CakeSize extends Cake {
  // Size of cake
  private final Size size;

  public CakeSize(final Cake baseCake, final Size size) {
    super(baseCake);
    this.size = size;
  }

  @Override
  public String getDescription() {
    return size.toString();
  }
}

