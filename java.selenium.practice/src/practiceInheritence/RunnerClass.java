package practiceInheritence;

public class RunnerClass {

	public static void main(String[] args) {
		System.out.println("\n===Bus===");
		Bus bus= new Bus();
		bus.start();
		bus.horn();
		bus.refuel();
		bus.vechileType();
		bus.stop();
		Bike bike = new Bike();
		bike.start();
		
//	     Bike bike=	new Bike();
//	     bike.start();
//	     Bus bus=  new Bus();
//	     bus.start();
	    }
}
