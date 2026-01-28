package selenium.vtiger;

public class Marketing {

	public static void main(String[] args) {
	int shirtCount3=3000;
	int jence1=1500;
	int jacket2=2200;
	int total=shirtCount3+jence1+jacket2;
	//.out.println(total)
System.out.println(total);
	
	int gst=15;
	int amt=total*gst/100;
	//System.out.println(amt);
	int totalBill=total+amt;
	System.out.println(totalBill);
	int discount=10;
	int amt1=discount*amt/100;
	int finalBill=totalBill-amt1;
	System.out.println(finalBill);
	
	//System.out.println(amt1);
	
	 

	}

}
