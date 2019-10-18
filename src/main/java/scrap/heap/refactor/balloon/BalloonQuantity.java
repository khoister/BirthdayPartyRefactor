package scrap.heap.refactor.balloon;

/**
 * The quantity of balloons
 */
public class BalloonQuantity extends Balloon {
  // Quantity of balloons
  private final int quantity;

  public BalloonQuantity(final Balloon baseBalloon, final int quantity) {
    super(baseBalloon);
    this.quantity = quantity;
  }

  @Override
  public String getDescription() {
    return String.valueOf(quantity);
  }
}

