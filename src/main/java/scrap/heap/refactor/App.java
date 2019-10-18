package scrap.heap.refactor;

import scrap.heap.refactor.balloon.*;
import scrap.heap.refactor.cake.*;
import scrap.heap.refactor.enums.*;


public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    //Place birthday party orders

    Balloon balloon = null;
    Cake cake = null;

    balloon = new BalloonBuilder()
      .withColor(Color.RED)
      .withMaterial(Material.MYLAR)
      .withQuantity(4)
      .build();
    cake = new CakeBuilder()
      .withFlavor(Flavor.CHOCOLATE)
      .withFrostingFlavor(FrostingFlavor.CHOCOLATE)
      .withShape(Shape.CIRCLE)
      .withSize(Size.LARGE)
      .withColor(Color.BROWN)
      .build();
    order(balloon, cake);

    balloon = new BalloonBuilder()
      .withColor(Color.BLUE)
      .withMaterial(Material.LATEX)
      .withQuantity(7)
      .build();
    cake = new CakeBuilder()
      .withFlavor(Flavor.VANILLA)
      .withFrostingFlavor(FrostingFlavor.CHOCOLATE)
      .withShape(Shape.SQUARE)
      .withSize(Size.MEDIUM)
      .withColor(Color.BROWN)
      .build();
    order(balloon, cake);

    balloon = new BalloonBuilder()
      .withColor(Color.YELLOW)
      .withMaterial(Material.MYLAR)
      .withQuantity(4)
      .build();
    cake = new CakeBuilder()
      .withFlavor(Flavor.VANILLA)
      .withFrostingFlavor(FrostingFlavor.VANILLA)
      .withShape(Shape.SQUARE)
      .withSize(Size.SMALL)
      .withColor(Color.YELLOW)
      .build();
    order(balloon, cake);
  }

  private static void order(final Balloon balloon, final Cake cake) {
    orderBalloons(balloon);
    orderCake(cake);
  }

  private static void orderBalloons(final Balloon balloon) {
    //for the purposes of this exercise, pretend this method works and adds balloons to the order
    System.out.println("Balloons ordered; " + balloon);
  }

  private static void orderCake(final Cake cake) {
    //for the purposes of this exercise, pretend that this method adds a cake to the order
    System.out.println("Cake ordered; " + cake);
  }
}

