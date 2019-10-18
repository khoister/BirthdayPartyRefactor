package scrap.heap.refactor.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum Flavor {
  CHOCOLATE("chocolate"),
  VANILLA("vanilla");

  private final String flavor;
  private final static Map<String, Flavor> map;

  static {
    map = Arrays.stream(Flavor.values()).collect(Collectors.toMap(Flavor::toString, fl -> fl));
  }

  Flavor(final String flavor) {
    this.flavor = flavor;
  }

  /**
   * Convert a string to a Flavor enum. Default is VANILLA.
   */
  public static Flavor of(final String fl) {
    return Optional.ofNullable(fl)
      .map(f -> map.get(f))
      .orElse(Flavor.VANILLA);
  }

  /**
   * Converts a Flavor to a string
   */
  @Override
  public String toString() {
    return flavor;
  }
}

