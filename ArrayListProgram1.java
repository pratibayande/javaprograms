package module1;

import java.util.ArrayList;

public class ArrayListProgram1 {
	
//WAP to merge two arraylist using a method with collection parameter.
	
	public static void main(String[] args) {

		ArrayList<Integer> a1=new ArrayList <Integer>();
		a1.add(20);
		a1.add(50);
		a1.add(60);
		a1.add(80);
		a1.add(90);
		System.out.println(a1);
		
		ArrayList<Integer> a2=new ArrayList <Integer>();
		a2.add(100);
		a2.add(25);
		a2.addAll(a1);
		
		System.out.println(a2);
	}

}
