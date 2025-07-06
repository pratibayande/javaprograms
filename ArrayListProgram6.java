package module1;

import java.util.ArrayList;

public class ArrayListProgram6 {

	//WAP of array list using below methods.a)contains() b)containsAll()
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList <Integer>();
		a1.add(23);
		a1.add(56);
		a1.add(77);
		a1.add(88);
		a1.add(96);
	boolean b1=	a1.contains(88);
	System.out.println(b1);
	System.out.println(a1);
	ArrayList<Integer> a2=new ArrayList <Integer>();
	a2.add(56);
	a2.addAll(a1);
	//a2.add(23);
	//a2.add(77);
	//a2.add(88);
	a2.add(96);
	System.out.println(a2);
	boolean b2 = a2.containsAll(a1);
	System.out.println(b2);

	}

}
