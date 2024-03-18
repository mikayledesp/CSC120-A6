/* This is a stub for the Cafe class */
/**
 * The cafe class holds stores info surrounding the name, adress, number of floors, number of coffe puncesm n of sugar pacjets , number of creams and number of cups used
 */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    /**
     * Constructs a Cafe that is an extension of the building class 
     * @param name
     * @param address
     * @param nFloors
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
        
    }
    /**
     * Sells coffe by subtracting from inventory based on values set in main
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
    this.nCoffeeOunces -= nCoffeeOunces;
    this.nSugarPackets -= nSugarPackets;
    this.nCreams -= nCreams;
    this.nCups -= 1 ;

    }
/**
 * Replenishes the cafe's inventory based on values set in main
 * @param nCoffeeOunces 
 * @param nSugarPackets
 * @param nCreams
 * @param nCups
 */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += 1 ; 
    }
/**
   * Print statements to test the methods above 
   * @param args
   */
    public static void main(String[] args) {
        Cafe L = new Cafe("Ltrain Café", "Neilson Drive", 2, 48, 100, 80, 10 );
        System.out.println(L);
        L.sellCoffee(4, 3, 4);
        System.out.println("Number of Cups: "+L.nCups);

    }
    
}
