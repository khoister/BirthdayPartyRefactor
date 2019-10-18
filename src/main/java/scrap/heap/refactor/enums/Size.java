package scrap.heap.refactor.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum Size {
  SMALL("small"),
  MEDIUM("med"),
  LARGE("large");

  private final String size;
  private final static Map<String, Size> map;

  static {
    map = Arrays.stream(Size.values()).collect(Collectors.toMap(Size::toString, s -> s));
  }

  Size(final String size) {
    this.size = size;
  }

  /**
   * Convert a string to a Size enum. Default is MEDIUM.
   */
  public static Size of(final String size) {
    return Optional.ofNullable(size)
      .map(s -> map.get(s))
      .orElse(Size.MEDIUM);
  }

  /**
   * Converts a Size to a string
   */
  @Override
  public String toString() {
    return size;
  }
}

