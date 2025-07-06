package module1;

import java.util.ArrayList;

public class ArrayListProgram9 {

	//"WAP using below methods of ArrayList. 1).clone() 2).equals() 3)LastIndexof()"

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList <Integer>();
		a1.add(23);
		a1.add(56);
		a1.add(77);
		a1.add(88);
		a1.add(96);
		System.out.println(a1.clone());
		ArrayList<Integer> a2=new ArrayList <Integer>();
		a2.add(12);
		a2.addAll(a1);
		//System.out.println(a2);

		System.out.println(a2.equals(a1));
		System.out.println(a2.lastIndexOf(88));
	
		
		
		

	}

}
