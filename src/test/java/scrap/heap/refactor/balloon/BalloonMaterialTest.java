/*
 * Unit tests for BalloonMaterial
 */
package scrap.heap.refactor.balloon;

import scrap.heap.refactor.enums.Material;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonMaterialTest {
  @Test
  public void testGetDescription() {
    Balloon balloon = new BalloonMaterial(new NullBalloon(), Material.MYLAR);
    assertEquals(balloon.getDescription(), "mylar");

    balloon = new BalloonMaterial(new NullBalloon(), Material.LATEX);
    assertEquals(balloon.getDescription(), "latex");
  }
}
