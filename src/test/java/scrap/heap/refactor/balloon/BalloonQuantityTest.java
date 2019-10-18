/*
 * Unit tests for BalloonQuantity
 */
package scrap.heap.refactor.balloon;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonQuantityTest {
  @Test
  public void testGetDescription() {
    Balloon balloon = new BalloonQuantity(new NullBalloon(), 7);
    assertEquals(balloon.getDescription(), "7");

    balloon = new BalloonQuantity(new NullBalloon(), 120);
    assertEquals(balloon.getDescription(), "120");
  }
}
