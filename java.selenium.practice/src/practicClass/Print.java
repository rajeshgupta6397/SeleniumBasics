package practicClass;

public class Print {
   public   void  print(String name ) {
	System.out.println("Print Strint value called  "+name);
 }  
	
	public void print(int b) {
		System.out.println("Print int value calle "+b);
	}
	
	public  void print(double h) {
		System.out.println("Double value called  " +h);
	}
	public static void main(String[] args) {
		
	Print print	=new Print();
	 print.print(10.2);

	}
    
}
