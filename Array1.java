package module1;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int[] arr2 = new int[arr.length];
		arr[0] = 45;
		arr[1] = 56;
		arr[2] = 96;
		System.out.println("arr : " + Arrays.toString(arr));

		for (int i = 0, j = arr2.length-1; i < arr.length; i++, j--) {
			arr2[j] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));

		boolean b = Arrays.equals(arr, arr2);
		System.out.println(b);

	}

}
