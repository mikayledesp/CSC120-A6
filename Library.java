/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");

    }
  
    public static void main(String[] args) {
     Library l = new Library("Neilson", "7 Neilson Drive, Northampton, MA 01063", 5);
      System.out.println(l);
    }
  
  }