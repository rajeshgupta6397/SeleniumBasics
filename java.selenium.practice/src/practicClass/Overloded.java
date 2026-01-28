package practicClass;

public class Overloded {

	public static void main(String[] args) {
    Overloded overloded=	new Overloded();
    overloded.search("101");	
	}
	public void search(String name) {
		System.out.println("String called name "+name);
	}
	public void search(int id) {
		System.out.println("Called int id "+id);
	}
	
}
