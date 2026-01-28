package stc_non;

public class Stc {
 static String name;
 int num;
	
 public static void main(String[] args) {
	Stc d= new Stc();
	d.m2(25);
	Stc.m1("rajesh");
 }
 public static void m1(String name) {
	 
	 
	 System.out.println(name);
 }
 public void m2(int num){
	 
	 System.out.println(num);
 }
}
