package practicClass;

public class Overload5 {

	public static void main(String[] args) {
    Overload5 overload=	new Overload5();
    overload.display("Hello");
	}
  public void display(Object o) {
	  System.out.println("object printed "+o);
  }
  public void display(String s) {
	  System.out.println("String printed  "+s);
  }
}
