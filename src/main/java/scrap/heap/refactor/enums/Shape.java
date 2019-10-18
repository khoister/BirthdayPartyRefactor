package scrap.heap.refactor.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum Shape {
  CIRCLE("circle"),
  HEART("heart"),
  OVAL("oval"),
  RECTANGLE("rectangle"),
  SQUARE("square");

  private final String shape;
  private final static Map<String, Shape> map;

  static {
    map = Arrays.stream(Shape.values()).collect(Collectors.toMap(Shape::toString, sh -> sh));
  }

  Shape(final String shape) {
    this.shape = shape;
  }

  /**
   * Convert a string to a Shape enum. Default is CIRCLE.
   */
  public static Shape of(final String sh) {
    return Optional.ofNullable(sh)
      .map(s -> map.get(s))
      .orElse(Shape.CIRCLE);
  }

  /**
   * Converts a Shape to a string
   */
  @Override
  public String toString() {
    return shape;
  }
}

