package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.*;

/**
 * Builds cake objects based on the attributes provided
 */
public class CakeBuilder {
  private Flavor flavor;
  private FrostingFlavor frostingFlavor;
  private Shape shape;
  private Size size;
  private Color color;

  public CakeBuilder withFlavor(final Flavor flavor) {
    this.flavor = flavor;
    return this;
  }

  public CakeBuilder withFrostingFlavor(final FrostingFlavor frostingFlavor) {
    this.frostingFlavor = frostingFlavor;
    return this;
  }

  public CakeBuilder withShape(final Shape shape) {
    this.shape = shape;
    return this;
  }

  public CakeBuilder withSize(final Size size) {
    this.size = size;
    return this;
  }

  public CakeBuilder withColor(final Color color) {
    this.color = color;
    return this;
  }

  public Cake build() {
    Cake cake = new PartyCake();
    if (flavor != null) cake = new CakeFlavor(cake, flavor);
    if (frostingFlavor != null) cake = new CakeFrostingFlavor(cake, frostingFlavor);
    if (shape != null) cake = new CakeShape(cake, shape);
    if (size != null) cake = new CakeSize(cake, size);
    if (color != null) cake = new CakeColor(cake, color);
    return cake;
  }
}

