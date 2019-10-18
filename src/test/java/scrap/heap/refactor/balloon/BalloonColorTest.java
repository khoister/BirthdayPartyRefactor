/*
 * Unit tests for BalloonColor
 */
package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Color;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonColorTest {
  @Test
  public void testGetDescription() {
    Balloon balloon = new BalloonColor(new NullBalloon(), Color.RED);
    assertEquals(balloon.getDescription(), "red");

    balloon = new BalloonColor(new NullBalloon(), Color.BLUE);
    assertEquals(balloon.getDescription(), "blue");
  }
}
