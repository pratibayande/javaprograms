package module1;

import java.util.ArrayList;

public class ArrayListProgram2 {

	//WAP to add a element to a Array list in a 3rd index position.
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList <Integer>();
		a1.add(23);
		a1.add(56);
		a1.add(77);
		a1.add(88);
		a1.add(96);
		System.out.println(a1);
		
		a1.add(3, 45);
		System.out.println(a1);
	}

}
