package polymorefigamsacnerio;

public class Levelvariable {
	String name ="Class-Leval Name";
	
  public static void main(String[] args) {
	Levelvariable levelvariable=	new Levelvariable();
	levelvariable.showName("Local Name");
	}
   public void showName(String name) {
	   System.out.println(this.name);
   }
}
