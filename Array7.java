package module1;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		int arr1[] = new int[4];
		arr1[0] = 78;
		arr1[1] = 59;
		arr1[2] = 50;
		arr1[3] = 24;
		
		int arr2[] = new int[4];
		arr2[0] = 50;
		arr2[1] = 63;
		arr2[2] = 45;
		arr2[3] = 12;
		//arr2[4] = 80;
		

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				
				if (arr1[i] == arr2[j]) {
				
					System.out.println(arr1[i]);

				}
			
			}
			

		}
		
	}
}
