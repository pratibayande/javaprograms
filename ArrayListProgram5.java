package module1;

import java.util.ArrayList;

public class ArrayListProgram5 {

	//WAP to erase all the elements of the arraylist.
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(56);
		a1.add(23);
		System.out.println(a1);
		a1.clear();
		
		System.out.println(a1);

	}

}
