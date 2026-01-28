package pojo;


public class Automation1  {
	
	public static void main(String[] args) {
		
		Employe emp= new Employe();
	    String addr= emp.getAddress();
		
		emp.setAddress("jaunpur");
		String addr1= emp.getAddress();
		System.out.println(addr1);
		System.out.println(addr);
		
		String oldname=emp.getName();
		System.out.println(oldname);
		
		emp.setName("jay");
	    String  nm=	emp.getName();
	    nm="rakesh";
	    System.out.println(nm);
		
	    int age=	 emp.getRetirementAge();
	    System.out.println(age);
	    
	    emp.setRetirementAge(55);
	    int newage=	emp.getRetirementAge();
	    newage=59;
	    System.out.println(newage);
	    
	    emp.setMob(123456789);
		int mobnum= emp.getempMobNo();
		System.out.println(mobnum);
	
	    
		 int no=  emp.getempMobNo();
		 no=897291379;
		 System.out.println(no);  
	     
	}
}
