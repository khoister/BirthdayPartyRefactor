/*
 * Unit tests for NullBalloon
 */
package scrap.heap.refactor.balloon;

import org.junit.Test;
import static org.junit.Assert.*;

public class NullBalloonTest {
  @Test
  public void testGetDescription() {
    Balloon balloon = new NullBalloon();
    assertTrue("NullBalloon should have empty description", balloon.getDescription().isEmpty());
  }
}
