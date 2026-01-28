package interviewQuestion;

import java.util.ArrayList;

public class LoopPractic {

	public static void main(String[] args) {
		fruitName();
//		Student_Name();
//		Product_Price();
//		Even_Number();
	}	
        public static void Student_Name() {  
		ArrayList<String>arlist=new ArrayList<String>();
		arlist.add("java");
		arlist.add("ramesh");
		arlist.add("rakesh");
		arlist.add("john");
		arlist.add("karan");
		
		 int totalCountnum= arlist.size();
		 System.out.println("Count total number should be show=="+totalCountnum);
        
		System.out.println("Oll Variable Should be Show=="+arlist);

		String thirdnum= arlist.remove(3);

		System.out.println("after removing  collection of data in arraylist=="+thirdnum);

	    String third= arlist.get(3);

		System.out.println("collection of data in arraylist=="+third);
		
		for(int i=0;i<arlist.size();i=i+1) {
			System.out.println("all variable count=="+i+ "Name="+""+ arlist.get(i));
		}
        }
        
        ////////////////////////////////////////////////////	
        public static void Product_Price() {
        	ArrayList<Double>Product_Price=new ArrayList<Double>();
        	Product_Price.add(14.5);
        	Product_Price.add(16.5);
        	Product_Price.add(65.3);
        	Product_Price.add(76.2);
        	Product_Price.add(54.9);
        	
        	int totalNum= Product_Price.size();
        	System.out.println("totalNum should be counting== "+totalNum);
        	
       System.out.println("all variable should be show== "+Product_Price);
       
       Double pointtype= Product_Price.remove(2);
       System.out.println("after removing two number varaiable in ArrayList== "+pointtype);
       
      Double getfirst= Product_Price.get(1);
      System.out.println("get meathad collection of data in ArrayList== "+getfirst);
       
       for(int i=0;i<totalNum;i=i+1) {
    	   System.out.println(Product_Price);
       }
       }
        
        public static void Even_Number() {
        ArrayList <Integer>arlist=  new ArrayList<Integer>();
     	arlist.add(2);
     	arlist.add(4);
     	arlist.add(6);
     	arlist.add(8);
     	arlist.add(10);
     	arlist.add(12);
     	arlist.add(14);
     	arlist.add(16);
     	arlist.add(18);
     	arlist.add(20);
     	
        int totaln= arlist.size();
        System.out.println("total count number="+totaln);
        
        Integer clear= arlist.remove(4);
        System.out.println("after removing collection of data in arraylist=="+clear);
        
        Integer accpet= arlist.get(7);
        System.out.println("get mathad collection of in arraylist-="+accpet);
        
       for(int i=0;i<totaln;i=i+1) {
     		System.out.println();
        }
     		
     	}
        
        public static void fruitName() {
        	
        ArrayList<String> fruit= new ArrayList<String>();
        fruit.add("Orange");
        fruit.add("Gauva");
        fruit.add("Papaya");
        fruit.add("Mango");
        fruit.add("Watermelon");
        boolean acontains= fruit.contains("Mango");
        if(acontains) {
        	System.out.println("Mango is  present in the list =="+acontains);
        }else {
        	System.out.println("Mango is not present in the list"+acontains);
        }
        }
    	
       
        
public static void max() {
ArrayList<Integer> data = 	new ArrayList<>();
data.add(89);
data.add(93);
data.add(90);
//int max = data.get(0);
for(int i =0; i<data.size();i++) {
	int ab=data.get(i);
	System.out.println(ab);
//	if(data.get(i)>max) {
//		max =data.get(i);
//		System.out.println(max);
//	}		
}
	}

}
