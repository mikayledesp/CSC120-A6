/* This is a stub for the House class */
/**
 * The house class holds stores infor surrounding the name, adress, whether the house has an elevator, dinning room and the number of floors
 */
import java.util.ArrayList;

public class House extends Building{

  public boolean hasDiningRoom;
  public boolean hasElevator; 
  // list that stores the names of all residents that live in said house
  ArrayList<String> residents;
  
  public int nResidents;
/**
 * Constructs a House which is an extension of the builfing class
 * @param name = String name of house 
 * @param address = String adress 
 * @param nFloors = int of number of floors in specific house
 * @param hasDiningRoom = boolean that responds based on if theres a dinning hall
 * @param hasElevator = boolean that responds based on if a specific house has an elevator or not
 */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super(name, address, nFloors);
    System.out.println("\nYou have built a house: 🏠");
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    
    this.residents = new ArrayList<String>();
  }
/**
 * Move's in residents by adding them to the resident's list for a specific house
 * @param name
 * 
 */
  public void moveIn(String name){
    this.residents.add(name);
    System.out.println("New Resident " + name + " has moved in");

  }
/**
 * Moves out residents by removing them from a resident's list for a specific house
 * @param name
 * 
 */
  public String moveOut(String name){
    this.residents.remove(name);
    System.out.println("New Resident " + name + " has moved out");
    return "New Resident" + name + " has moved out";
  }
/**
 * Checks to see if the residents are contained in a specific house and returns either true of false based on that
 * @param person
 * @return true
 * @return false
 */
  public boolean isResident(String person){
    if (this.residents.contains(person)){
      System.out.println(name + "lives here!");
      return true;
    } 
    System.out.println(name + " doesn't lives here!");
    return false;
    
  }
  /**
   * Print statements to test the methods above 
   * @param args
   */
  public static void main(String[] args) {
    House capen = new House("Capen", "26 Prospect Street", 3, false, false);
    System.out.println(capen);
    capen.moveIn("Mikayle");
    capen.moveIn("Fia");
    capen.moveIn("Alice");
    capen.moveIn("Emma");
    capen.moveOut("Emma");
    System.out.println(capen.residents);
    System.out.println(capen.isResident("Emma"));

    
  }

}