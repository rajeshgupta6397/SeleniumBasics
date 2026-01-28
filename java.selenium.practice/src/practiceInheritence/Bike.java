package practiceInheritence;

public class Bike extends Vechile {
	
	int x =30;
	
	public void Bike() {
		System.out.println("My Vehicle name is Bike ...");
	}
    
	public void start() {
		System.out.println(this.x);
	super.start();
	super.horn();
	super.refuel();
	System.out.println("bike is working find it start with keys");
   	 System.out.println("vechile is starting with Kick....");
    }
	
	public void showType() {
		System.out.println("Vehicle type: ");
	}
	public static void main(String[] args) {
		Vechile bike= new Bike ();
		bike.start();
	    bike.horn();
	    Vechile v= new  Car();
	    Vechile vechile= new Bike();
	    Vechile vechil= new Vechile();
	}
}
