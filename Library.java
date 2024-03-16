/* This is a stub for the Library class */

import java.util.Hashtable;

import javax.management.RuntimeErrorException;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
      
    }
    
    public void addTitle(String title){
      this.collection.put(title, true);
      System.out.println("The Book: " + title + "has been added to " + this.name );
    }
    public String removeTitle(String title){
      if (this.collection.containsKey(title)){
        this.collection.remove(title);
        System.out.println(title + " has been removed from " + this.name + ".");
      } else{
        throw new RuntimeErrorException(  null, this.name + "doesn't have: "  + title + ", so it couldn't be removed" );
      }
      return title;
    }

    public void checkOut(String title){
      if (this.collection.containsKey(title)){
        this.collection.replace(title, false);
        System.out.println(title + " has now been checked out!");
      } else{
        System.out.println("Error: This book cannot be checked out!");
      }
    }

    public void returnBook (String title){
      if (this.collection.containsKey(title)){
        this.collection.replace(title, true);
        System.out.println("Success: You have now returned" + title);
      } else {
        System.out.println("Error: " + title + " cannot be returned!");

      }
    }
    // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title){
      if (!this.collection.containsKey(title)){
        return false;
      }
      return true;
    }
    // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title){
      if (this.collection.get(title));{
        return true;
      }
  
    }
     // prints out the entire collection in an easy-to-read way (including checkout status)
    public void printCollection(){
    System.out.println("\nNeilson Library Collection: ");
      for (String title: this.collection.keySet()){
        System.out.println(title);
      }
      
    }
    public static void main(String[] args) {
     Library neilson = new Library("Neilson", "7 Neilson Drive, Northampton, MA 01063", 5);
      System.out.println(neilson);
      neilson.addTitle("World Dictionary");
      neilson.addTitle("Osh Kosh B'gosh");
      neilson.addTitle("Turtle Manifesto");
      neilson.addTitle("Mikayle's Recipe book");
      neilson.addTitle("Tiktok Manifesto");
      neilson.checkOut("World Dictionary");
      neilson.printCollection();
      neilson.removeTitle("World Dictionary");
      neilson.printCollection();
      neilson.returnBook("World Dictionary");
      
      
      
      
    }
  
  }