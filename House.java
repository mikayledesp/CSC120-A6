/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{

  public boolean hasDiningRoom;
  public boolean hasElevator; 
  ArrayList<String> residents;
  public int nResidents;

  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super(name, address, nFloors);
    System.out.println("\nYou have built a house: 🏠");
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    
    this.residents = new ArrayList<String>();
  }

  public void moveIn(String name){
    this.residents.add(name);
    System.out.println("New Resident" + name + "has moved in");

  }
  public String moveOut(String name){
    this.residents.remove(name);
    // System.out.println("New Resident" + name + "has moved out");
    return "New Resident" + name + "has moved out";
  }

  public boolean isResident(String person){
    if (this.residents.contains(person)){
      System.out.println(name + "lives here!");
      return true;
    } 
    return false;
    
  }
  public static void main(String[] args) {
    House h = new House("Capen", "26 Prospect Street", 3, false, false);
    System.out.println(h);
   
  }

}