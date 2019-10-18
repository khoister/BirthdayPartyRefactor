package scrap.heap.refactor.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum FrostingFlavor {
  CHOCOLATE("chocolate"),
  VANILLA("vanilla");

  private final String frostingFlavor;
  private final static Map<String, FrostingFlavor> map;

  static {
    map = Arrays.stream(FrostingFlavor.values()).collect(Collectors.toMap(FrostingFlavor::toString, f -> f));
  }

  FrostingFlavor(final String frostingFlavor) {
    this.frostingFlavor = frostingFlavor;
  }

  /**
   * Convert a string to a FrostingFlavor enum. Default is VANILLA.
   */
  public static FrostingFlavor of(final String fr) {
    return Optional.ofNullable(fr)
      .map(f -> map.get(f))
      .orElse(FrostingFlavor.VANILLA);
  }

  /**
   * Converts a FrostingFlavor to a string
   */
  @Override
  public String toString() {
    return frostingFlavor;
  }
}

