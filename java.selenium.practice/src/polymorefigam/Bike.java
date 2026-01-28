package polymorefigam;

public class Bike extends Vechile {
	
	public void Bike() {
		System.out.println("MY vehicle neme is Bike..");
	}
	
	public void start() {
		System.out.println("Vechile is starting with kick");
	}
	public void showType() {
		System.out.println("Vehicle Type: ");
	}
	public static void main(String[] args) {
	    Bike bike= new Bike ();
	    bike.Bike();
	    bike.horn();
	    Vechile v= new  Car();
	    Vechile vechile= new Bike();
	}

}
