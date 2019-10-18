/*
 * Unit tests for Balloon
 */
package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Material;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonTest {
  @Test
  public void testToString() {
    Balloon balloon = new PartyBalloon();
    balloon = new BalloonQuantity(balloon, 9);
    balloon = new BalloonMaterial(balloon, Material.MYLAR);
    balloon = new BalloonColor(balloon, Color.BLUE);
    assertEquals(balloon.toString(), "9, mylar, blue");

    Balloon balloon2 = new PartyBalloon();
    balloon2 = new BalloonColor(balloon2, Color.RED);
    balloon2 = new BalloonQuantity(balloon2, 3);
    balloon2 = new BalloonMaterial(balloon2, Material.LATEX);
    assertEquals(balloon2.toString(), "red, 3, latex");
  }
}
