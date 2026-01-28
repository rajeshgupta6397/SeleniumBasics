package practicClass;

public class Scenario4 {

	public static void main(String[] args) {
		Scenario4 overloded=new Scenario4();
		overloded.area(5, 5);
	}
  public void area(int side) {
	  System.out.println("int side area  "+side);
  }
  public void area(int lenght, int breadth) {
	  System.out.println("lenght print  ="+lenght);
	  System.out.println("breadth print  ="+breadth);
  }
}
