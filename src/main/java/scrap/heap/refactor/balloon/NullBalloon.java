package scrap.heap.refactor.balloon;

/**
 * Represents a null balloon object. Cannot be instantiated outside of this package
 */
class NullBalloon extends Balloon {
  NullBalloon() {
    super(null);
  }

  @Override
  public String getDescription() {
    return "";
  }
}

