package myPractice;

public class CarClass {
	String brand;
	String clour;

	public static void main(String[] args) {
	CarClass car=	new CarClass();
	CarClass car1= new CarClass();
	
	car1.brand="BMW";
	car1.clour="Black";
	System.out.println("Car ka Brand ="+car1.brand + ", Car ka Clour ="+car1.clour);
	
	
	car.brand="Maruti";
	car.clour="White";
	
	System.out.println("Car Ka Brand ="+car.brand + ", Car Ka Clour ="+car.clour);
	
		

	}

}
