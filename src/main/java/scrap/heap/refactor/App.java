package scrap.heap.refactor;

import scrap.heap.refactor.balloon.Balloon;
import scrap.heap.refactor.balloon.BalloonColor;
import scrap.heap.refactor.balloon.BalloonMaterial;
import scrap.heap.refactor.balloon.BalloonQuantity;
import scrap.heap.refactor.balloon.PartyBalloon;
import scrap.heap.refactor.cake.Cake;
import scrap.heap.refactor.cake.CakeColor;
import scrap.heap.refactor.cake.CakeFlavor;
import scrap.heap.refactor.cake.CakeFrostingFlavor;
import scrap.heap.refactor.cake.CakeShape;
import scrap.heap.refactor.cake.CakeSize;
import scrap.heap.refactor.cake.PartyCake;
import scrap.heap.refactor.enums.Color;
import scrap.heap.refactor.enums.Flavor;
import scrap.heap.refactor.enums.FrostingFlavor;
import scrap.heap.refactor.enums.Material;
import scrap.heap.refactor.enums.Shape;
import scrap.heap.refactor.enums.Size;


public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    //Place birthday party orders
    order(Color.RED, Material.MYLAR, 4, Flavor.CHOCOLATE, FrostingFlavor.CHOCOLATE, Shape.CIRCLE, Size.LARGE, Color.BROWN);
    order(Color.BLUE, Material.LATEX, 7, Flavor.VANILLA, FrostingFlavor.CHOCOLATE, Shape.SQUARE, Size.MEDIUM, Color.BROWN);
    order(Color.YELLOW, Material.MYLAR, 4, Flavor.VANILLA, FrostingFlavor.VANILLA, Shape.SQUARE, Size.SMALL, Color.YELLOW);
  }

  private static void order(Color balloonColor, Material material, int number, Flavor flavor, FrostingFlavor frostingFlavor, Shape shape, Size size, Color cakeColor) {
    orderBalloons(balloonColor, material, number);
    orderCake(flavor, frostingFlavor, shape, size, cakeColor);
  }

  private static void orderBalloons(Color balloonColor, Material material, int number) {
    //for the purposes of this exercise, pretend this method works and adds balloons to the order

    // Decorate the balloon object until it has all the features needed for the order
    Balloon balloon = new PartyBalloon();
    balloon = new BalloonColor(balloon, balloonColor);
    balloon = new BalloonMaterial(balloon, material);
    balloon = new BalloonQuantity(balloon, number);

    // Each layer of balloon object is responsible for adding its part to the balloon order
    System.out.println("Balloons ordered; " + balloon);
  }

  private static void orderCake(Flavor flavor, FrostingFlavor frostingFlavor, Shape shape, Size size, Color cakeColor){
    //for the purposes of this exercise, pretend that this method adds a cake to the order

    // Decorate the cake object until it has all the features we need for the order
    Cake cake = new PartyCake();
    cake = new CakeFlavor(cake, flavor);
    cake = new CakeFrostingFlavor(cake, frostingFlavor);
    cake = new CakeShape(cake, shape);
    cake = new CakeSize(cake, size);
    cake = new CakeColor(cake, cakeColor);

    // Each layer of cake object is responsible for adding its part to the cake order
    System.out.println("Cake ordered; " + cake);
  }
}

