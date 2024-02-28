import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ColorXYCoord coord1 = new ColorXYCoord(10,20,"red");
    ColorXYCoord coord2 = new ColorXYCoord(10,20,"red");
    ColorXYCoord coord3 = new ColorXYCoord(30,40,"red");
    ColorXYCoord coord4 = new ColorXYCoord(10,20,"blue");

    // testing getters
    System.out.println("coord1.getX() = " +
                       coord1.getX());

    System.out.println("coord1.getY() = " +
                       coord1.getY());
  
    System.out.println("coord1.getColor() = " +
                       coord1.getColor());
 
    // testing toString
    System.out.println("coord1.toString() = " +
                       coord1.toString());

    // testing equals
    System.out.println("coord2.equals(coord1) = " +
                       coord2.equals(coord1)); 
    System.out.println("coord3.equals(coord1) = " +
                       coord3.equals(coord1)); 
    System.out.println("coord4.equals(coord1) = " +
                       coord4.equals(coord1)); 
  }
}