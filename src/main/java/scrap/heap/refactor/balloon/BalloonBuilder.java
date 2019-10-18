package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.*;

/**
 * Builds balloon objects based on the attributes provided
 */
public class BalloonBuilder {
  private Color color;
  private Material material;
  private Integer quantity;

  public BalloonBuilder withColor(final Color color) {
    this.color = color;
    return this;
  }

  public BalloonBuilder withMaterial(final Material material) {
    this.material = material;
    return this;
  }

  public BalloonBuilder withQuantity(final int quantity) {
    this.quantity = quantity;
    return this;
  }

  public Balloon build() {
    Balloon balloon = new PartyBalloon();
    if (color != null) balloon = new BalloonColor(balloon, color);
    if (material != null) balloon = new BalloonMaterial(balloon, material);
    if (quantity != null) balloon = new BalloonQuantity(balloon, quantity);
    return balloon;
  }
}

