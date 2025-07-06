package module1;

import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the index of a array");

		int ind[] = new int[s.nextInt()];

		for (int i = 0; i < ind.length; i++) {
			System.out.println("Enter the value of array at index " + i);
			ind[i] = s.nextInt();

			System.out.println("The output of array is " + Arrays.toString(ind));
		
		}
		s.close();
		
		String s1 = Arrays.toString(ind);

		String n1 = s1.substring(1, 3);
		String n2 = s1.substring(5, 7);
		String n3 = s1.substring(9, 11);

		int a1 = Integer.parseInt(n1);
		int a2 = Integer.parseInt(n2);
		int a3 = Integer.parseInt(n3);
		int len = s1.length();

		int avg = a1 + a2 + a3 / len;

		System.out.println("Average of a given array is " + avg);

		
	}

}
