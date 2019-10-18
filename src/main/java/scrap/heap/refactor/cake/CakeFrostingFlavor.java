package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.FrostingFlavor;

public class CakeFrostingFlavor extends Cake {
  // FrostingFlavor of cake
  private final FrostingFlavor frostingFlavor;

  public CakeFrostingFlavor(final Cake baseCake, final FrostingFlavor frostingFlavor) {
    super(baseCake);
    this.frostingFlavor = frostingFlavor;
  }

  @Override
  public String getDescription() {
    return frostingFlavor.toString();
  }
}

