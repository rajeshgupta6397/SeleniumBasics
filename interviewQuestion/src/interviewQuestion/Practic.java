package interviewQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Practic {

	public static void main(String[] args) {
	
   String []name = {"Rajesh","Rahul"};
   
   int [] num= {343,343,545,555,745};
//  int b=  num.length;
//  System.out.println(b);
//  
//  for(int i=0;i<=num.length-1;i++) {
//		 int un=num[i];
//		 System.out.println(un);
//  }
  for(int a:num) {
		 System.out.println(a);
	 }
   
   int [] x= new int [15];
   
   x[5]=5353;
   
   String []r=new String [15];
   
   ArrayList<String> ab= new ArrayList<String>();
   ab.add("rajesh");
   ab.add("rajesh");
   ab.add("rahul");
   int at= ab.size();
   System.out.println(at);
   String n= ab.get(2);
   System.out.println(n);
   System.out.println(ab);
   
   for(int i=0;i<=ab.size()-1;i=i+2) {
	String val =  ab.get(i);
	System.out.println(val);
   }
   for(String value :ab) {
	   System.out.println(value);
   }
   
   List<String> nm= new LinkedList<String>();
   nm.add("rakesh");
   nm.add("rakesh");
   nm.add("rupesh");
   nm.add("rakesh");
   System.out.println(nm);
  String nk= nm.get(2);
   System.out.println(nk);
   
  HashSet<String> hs=  new HashSet<String>();
  hs.add("abcd");
  hs.add("abcd");
  hs.add("bcde");
  hs.add("hasssfd");
  hs.add("tfasfhfsfs");
  System.out.println(hs);
   
  for(String hst:hs) {
	  System.out.println(hst);
  }
   LinkedHashSet<String>hsd=new  LinkedHashSet<String>();
   hsd.add("asfs");
   hsd.add("radd");
   hsd.add("jasjd");
   hsd.add("34341");
   
   for(String hj:hsd) {
	   System.out.println(hj);
   }
  }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}


