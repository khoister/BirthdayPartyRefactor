package scrap.heap.refactor.cake;

/**
 * Abstract cake
 */
public abstract class Cake {
  private final Cake baseCake;

  Cake(final Cake base) {
    baseCake = base;
  }

  Cake getBaseCake() {
    return baseCake;
  }

  public abstract String getDescription();

  /**
   * Template method to display aggregate cake object
   */
  @Override
  public String toString() {
    if (getBaseCake().getDescription().isEmpty())
      return getDescription();

    return getBaseCake() + ", " + getDescription();
  }
}

