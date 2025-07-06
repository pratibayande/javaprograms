package module1;

import java.util.ArrayList;

public class ArrayListProgram3 {
//WAP to check whether an Arraylist is empty or not
	
	public static void main(String[] args) {
		
		ArrayList<Integer>	a1=new ArrayList <Integer> ();
		a1.add(null);
		a1.add(0);
		a1.add(0);
		
		System.out.println(a1);
		System.out.println(a1.isEmpty());
	}

}
