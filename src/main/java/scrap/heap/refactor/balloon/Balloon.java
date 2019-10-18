package scrap.heap.refactor.balloon;

/**
 * Abstract balloon
 */
public abstract class Balloon {
  private final Balloon baseBalloon;

  Balloon(final Balloon base) {
    baseBalloon = base;
  }

  Balloon getBaseBalloon() {
    return baseBalloon;
  }

  public abstract String getDescription();

  /**
   * Template method to display aggregate balloon object
   */
  @Override
  public String toString() {
    if (getBaseBalloon().getDescription().isEmpty())
      return getDescription();

    return getBaseBalloon() + ", " + getDescription();
  }
}

