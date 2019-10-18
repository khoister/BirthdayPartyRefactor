package scrap.heap.refactor.cake;

/**
 * Represents a null cake object. Cannot be instantiated outside of this package
 */
class NullCake extends Cake {
  NullCake() {
    super(null);
  }

  @Override
  public String getDescription() {
    return "";
  }
}

