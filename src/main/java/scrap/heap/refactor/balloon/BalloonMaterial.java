package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Material;

/**
 * Material of the balloon
 */
public class BalloonMaterial extends Balloon {
  // Material of balloon
  private final Material material;

  public BalloonMaterial(final Balloon baseBalloon, final Material material) {
    super(baseBalloon);
    this.material = material;
  }

  @Override
  public String getDescription() {
    return material.toString();
  }
}

