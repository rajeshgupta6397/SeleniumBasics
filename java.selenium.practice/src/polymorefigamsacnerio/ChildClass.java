package polymorefigamsacnerio;

public class ChildClass extends ParentClass{
	 
	public static void main(String[] args) {
		ChildClass childClass= new ChildClass();
		childClass.showMessage();
	 }
	
	public void message() {
		 System.out.println("Child Message");
	 }
	
	public void showMessage() {
	super.message();
	message();
	
 }
}
