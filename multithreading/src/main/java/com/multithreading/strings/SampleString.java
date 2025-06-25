package com.multithreading.strings;

public class SampleString {

	public static void main(String[] args) {
		String s = new String("Lakshmi");
		s.concat("vamsi");
		s =s.concat("vamsi");//if we are not aassigen to this value to s1 then its moved to garbage collector
		System.out.println("S::"+ s);
		System.out.println("S1::"+ s);
	//............................................................................	
		StringBuffer sb = new StringBuffer("Lakshmi");
		sb.append("vamsi");
		System.out.println("sb:"+sb);
		//.......................................................................
		String name = new String("vamsi");
		String name1 = new String("vamsi");
		String name3 = "vamsi";
		String name4 = "vamsi";
		//............................................................................
		String vale1 = new String("Spring");
		vale1.concat("Fall");
		String vale2= vale1.concat("winter");
		String vale3 =vale2.concat("winter");
		System.out.println("vale1:"+vale1);
		System.out.println("vale2:"+vale2);
		//..............................................................
		
		String c1 = new String("YOU CAN'T CHANGE ME");
		String c2 = new String("YOU CAN'T CHANGE ME");
		
		System.out.println(c1==c2);
		String c3 = "YOU CAN'T CHANGE ME";
		System.out.println(c1==c3);

	}

}
