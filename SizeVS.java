package module1;

import java.util.Stack;
import java.util.Vector;

//WAP to prove below collection doubles it's size, when current capacity is exceeded. 1)Vector 2)Stack

public class SizeVS {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		System.out.println("Initial capacity :" + v.capacity());
		for(int i=0;i<=20;i++) 
		{
			v.add(i);
			 System.out.println("After adding element " + i + ", Vector size: " + v.size() + ", capacity: " + v.capacity());

		}
		Stack<Integer> s=new Stack<Integer>();
		System.out.println("Initial capacity :" + s.capacity());
		for(int i=0;i<=20;i++) 
		{
			s.push(i);
			 System.out.println("After adding element " + i + ", Stack size: " + s.size() + ", capacity: " + s.capacity());

		}
	}

}
