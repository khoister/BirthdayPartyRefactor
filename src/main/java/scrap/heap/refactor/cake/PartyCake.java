package scrap.heap.refactor.cake;

/**
 * Party cakes
 */
public class PartyCake extends Cake {

  public PartyCake() {
    this(new NullCake());
  }

  public PartyCake(final Cake base) {
    super(base);
  }

  @Override
  public String getDescription() {
    return "";
  }
}

