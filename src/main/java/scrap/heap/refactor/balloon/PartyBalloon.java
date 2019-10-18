package scrap.heap.refactor.balloon;

/**
 * Party balloons
 */
public class PartyBalloon extends Balloon {

  public PartyBalloon() {
    this(new NullBalloon());
  }

  public PartyBalloon(final Balloon base) {
    super(base);
  }

  @Override
  public String getDescription() {
    return "";
  }
}

