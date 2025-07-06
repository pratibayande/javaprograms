package module1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram8 {

	//WAP to prove that Arraylist is dynamic in nature.
	public static void main(String[] args) {
	
		ArrayList<Integer> a1=new ArrayList <Integer>();
		a1.add(20);
		a1.add(50);
		a1.add(60);
		a1.add(80);
		a1.add(90);
		a1.add(190);
		a1.add(910);
		a1.add(9);
		a1.add(780);
		a1.add(45);
		a1.add(9);
		a1.add(20);
		a1.add(50);
		a1.add(60);
		a1.add(80);
		a1.add(80);
		a1.add(90);
		a1.add(190);
		a1.add(910);
		Collections.sort(a1);
		System.out.println(a1);
	}

}
