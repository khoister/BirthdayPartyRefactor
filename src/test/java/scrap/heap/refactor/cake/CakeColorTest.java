/*
 * Unit tests for CakeColor
 */
package scrap.heap.refactor.cake;

import scrap.heap.refactor.enums.Color;
import org.junit.Test;
import static org.junit.Assert.*;

public class CakeColorTest {
  @Test
  public void testGetDescription() {
    Cake cake = new CakeColor(new NullCake(), Color.RED);
    assertEquals(cake.getDescription(), "red");

    cake = new CakeColor(new NullCake(), Color.BROWN);
    assertEquals(cake.getDescription(), "brown");
  }
}
