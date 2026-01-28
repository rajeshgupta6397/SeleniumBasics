package myPractice;

public class Practice  {

	public static void main(String[] args) {
		roll();
//		student();
//		avarageStudent ();
	}
	public static void roll(){
		int []a=new int[10];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		System.out.println(a[8]);
	System.out.println(a[9]);
//		System.out.println(a[10]);//ArrayIndexOutOfBoundsException
	}	
		
		public static void student() {
			String[]name =new String[6];
			name[0]="rakesh";
			name[1]="ranjan";
			name[2]="rupesh";
			name[3]="taj";
			name[4]="suraj";
//			name[5]="pintu";
//			name[6]="tinku";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		System.out.println(name[5]);
		}
		public static void avarageStudent () {
			int []a=new int[10];
			int x=a[0]=5;
			int y=a[1]=10;
			int z=x+y;
			x=z-x;
			y=z-y;
			System.out.println("a[0]=5 after swap :"+x);
			System.out.println("a[1]=10 after swap :"+y);
			
		}
		
	
	//public static void age() {
		//int []age= {23,34,23,25};
		//int jayparkas=[0];
	}
    	
    

