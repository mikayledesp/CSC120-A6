/* This is a stub for the Cafe class */
public class Cafe extends Building {

    public Cafe(String name, String address, int nFloors){
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
        Cafe l = new Cafe("Neilson", "7 Neilson Drive, Northampton, MA 01063", 5);
        System.out.println(l);
    }
    
}
