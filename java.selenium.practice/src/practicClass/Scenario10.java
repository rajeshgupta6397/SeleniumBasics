package practicClass;

public class Scenario10 {

	public static void main(String[] args) {
	Scenario10 scenario =new	Scenario10();
	scenario.display(10);
	}
    public void display(int a) {
    	System.out.println("print a hoga "+a);
    }
    public void didplay(int...a) {
    	System.out.println("it is not print ="+a);
    }
}
