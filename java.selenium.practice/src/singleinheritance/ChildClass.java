package singleinheritance;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
	ChildClass childClass=	new ChildClass();//child and parent class load 2
	childClass.farmhouse();	
	new ParentClass();
	childClass.childmethod1();

	}
  public void childmethod1() {
	  System.out.println("childmethod1");
  }
}
