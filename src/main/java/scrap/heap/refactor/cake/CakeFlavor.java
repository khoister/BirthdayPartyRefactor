package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Flavor;

public class CakeFlavor extends Cake {
  // Flavor of cake
  private final Flavor flavor;

  public CakeFlavor(final Cake baseCake, final Flavor flavor) {
    super(baseCake);
    this.flavor = flavor;
  }

  @Override
  public String getDescription() {
    return flavor.toString();
  }
}

