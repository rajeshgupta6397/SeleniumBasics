package practicClass;

public class Scenario8 {

	public static void main(String[] args) {
	Scenario8 scenario=	new Scenario8();
	scenario.send("A","B");//it is compile time error
	}
	public void send(int A,String B) {
		System.out.println("Print send ="+A);
		System.out.println("Print send ="+B);
	}
    public void send(String A ,int B) {
    	System.out.println("Print Send "+A);
    	System.out.println("print send ="+B);
    }
}
