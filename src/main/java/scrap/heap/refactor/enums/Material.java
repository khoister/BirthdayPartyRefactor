package scrap.heap.refactor.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum Material {
  LATEX("latex"),
  MYLAR("mylar");

  private final String material;
  private final static Map<String, Material> map;

  static {
    map = Arrays.stream(Material.values()).collect(Collectors.toMap(Material::toString, mat -> mat));
  }

  Material(final String material) {
    this.material = material;
  }

  /**
   * Convert a string to a Material enum. Default is LATEX.
   */
  public static Material of(final String mat) {
    return Optional.ofNullable(mat)
      .map(m -> map.get(m))
      .orElse(Material.LATEX);
  }

  /**
   * Converts a Material to a string
   */
  @Override
  public String toString() {
    return material;
  }
}

