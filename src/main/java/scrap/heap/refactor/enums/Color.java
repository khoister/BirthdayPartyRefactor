package scrap.heap.refactor.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum Color {
  BLUE("blue"),
  BROWN("brown"),
  RED("red"),
  YELLOW("yellow"),
  NO_COLOR("");

  private final String color;
  private final static Map<String, Color> map;

  static {
    map = Arrays.stream(Color.values()).collect(Collectors.toMap(Color::toString, col -> col));
  }

  Color(final String color) {
    this.color = color;
  }

  /**
   * Convert a string to a Color enum. Default is NO_COLOR.
   */
  public static Color of(final String col) {
    return Optional.ofNullable(col)
      .map(c -> map.get(c))
      .orElse(Color.NO_COLOR);
  }

  /**
   * Converts a Color to a string
   */
  @Override
  public String toString() {
    return color;
  }
}

