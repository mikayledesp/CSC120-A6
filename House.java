/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{

  public boolean hasDiningRoom;
  public int nResidents;

  public House() {
    System.out.println("\nYou have built a house: 🏠");
  }

  public static void main(String[] args) {
    new House();
  }

}