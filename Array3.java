package module1;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of array at run time");
		int[] rollno = new int[s1.nextInt()];
		
		for (int i = 0; i < rollno.length; i++) {
			System.out.println("Enter the value at index poition-> " + i);
			rollno[i] = s1.nextInt();
			
			//System.out.println(rollno[i]);
			
			System.out.println("The output Array is-> " + Arrays.toString(rollno));
			
		}
		
		s1.close();

	}

}
