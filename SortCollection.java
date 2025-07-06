package module1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class SortCollection {
//Check whether following can be sorted or not.1)ArrayList 2)LinkedList 3)Vector 4)Stack 5)PriorityQueue 6)LinkedList(Queue) 
//7)ArrayDeque 8)HashSet 9)LinkedHashSet 10)TreeSet
		public static void main(String[] args) {
			ArrayList<Integer> a=new ArrayList<Integer>();
			a.add(29);
			a.add(1, 25);
			a.add(40);
			a.add(40);
			System.out.println("==============LIST===================");
			Collections.sort(a);
			System.out.println("ArrayList:" + a);

			LinkedList<Integer> l=new LinkedList<Integer>();	
			l.add(29);
			l.add(1, 25);
			l.add(40);	
			l.add(40);
			Collections.sort(l);
			System.out.println("LinkedList:" + l);
		
			Vector<Integer> v=new Vector<Integer>();	
			v.add(29);
			v.add(1, 25);
			v.add(40);	
			v.add(40);
			Collections.sort(v);
			System.out.println("Vector :" + v);
			
			Stack<Integer> s=new Stack<Integer>();	
			s.add(29);
			s.add(1, 25);
			s.add(40);	
			s.add(40);
			Collections.sort(s);
			System.out.println("Stack :" + s);
				
			System.out.println("==============QUEUE===================");	
			
			PriorityQueue<Integer> p=new PriorityQueue<Integer>();	
			p.add(29);
			p.add(25);
			//p.add(1, 25);
			p.add(40);	
			p.add(40);
			//Collections.sort(p);
			System.out.println("PriorityQueue:" + p);
			
			LinkedList<Integer> l1=new LinkedList<Integer>();	
			l1.add(29);
			l1.add(1, 25);
			l1.add(40);
			l1.add(40);
			Collections.sort(l1);
			System.out.println("LinkedList:" + l1);
			
			ArrayDeque<Integer> aq=new ArrayDeque<Integer>();	
			aq.add(29);
			aq.add(25);
			//aq.add(1, 25);
			aq.add(40);
			aq.add(40);
			//Collections.sort(aq);
			System.out.println("ArrayDeque:" + aq);
			
			System.out.println("==============SET===================");	
			
			HashSet<Integer> h=new HashSet<Integer>();	
			h.add(29);
			h.add(25);
			//h.add(1, 25);
			h.add(40);	
			h.add(40);
			//Collections.sort(h);
			System.out.println("HashSet:" + h);
			
			LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();	
			l2.add(29);
			l2.add(25);
			//l2.add(1, 25);
			l2.add(40);	
			l2.add(40);
		//	Collections.sort(l2);
			System.out.println("LinkedHashSet:" + l2);
			
			TreeSet<Integer> t=new TreeSet<Integer>();	
			t.add(29);
			t.add(25);
			//t.add(1, 25);
			t.add(40);	
			t.add(40);
			//Collections.sort(t);
			System.out.println("TreeSet:" + t);
			

	}

}
