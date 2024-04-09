/* This is a stub for the House class */
/**
 * The house class holds stores infor surrounding the name, adress, whether the house has an elevator, dinning room and the number of floors
 */
import java.util.ArrayList;

public class House extends Building{

  private boolean hasDiningRoom;
  private boolean hasElevator; 
  // list that stores the names of all residents that live in said house
  private ArrayList<String> residents;
  
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
   * Acessor for hasDinningRoom
   * @return if specifc house being called has a dinning room or not
   */
  public boolean getHasDinningRoom{
    return this.hasDiningRoom
  }
  /**
   * Acessor for hasElevator
   * @return if specific house being called ha a elevator or not 
   */
  public boolean getHasDinningRoom{
    return this.hasDiningRoom
  }

  /**
 * Checks to see if the residents are contained in a specific house and returns either true of false based on that
 * @param person
 * @return true
 * @return false
 */
public boolean isResident(String person){
  if (this.residents.contains(person)){
    System.out.println( person + "lives here!");
    return true;
  } 
  System.out.println(person + " doesn't live here!");
  return false;
  
}
/**
 * Move's in residents by adding them to the resident's list for a specific house
 * @param name
 * 
 */
  public void moveIn(String name){
    if (!isResident(name)){
      this.residents.add(name);
      System.out.println("New Resident " + name + " has moved in");
  
    }
    else{
      System.out.println("Error, " + name + " cannot move into this house. They might already live here !");
    }

  }
/**
 * Moves out residents by removing them from a resident's list for a specific house
 * @param name
 * 
 */
  public String moveOut(String name){
    if (!isResident(name)){
      this.residents.remove(name);
    System.out.println("New Resident " + name + " has moved out");
    return "New Resident" + name + " has moved out";
    }
   else{
    System.out.println("Error,"+ name + "cannot be moved out. Please try to move out someone who actually lives here!");
   }
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