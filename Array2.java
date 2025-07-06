package module1;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		String s1 = "deepika";
		String s2 = "ranveer";

		if (s1.length() != s2.length()) {
			System.out.println("Since length is not same, can never be Anagram");
		} else {
			char[] a = s1.toCharArray();
			char[] a2 = s2.toCharArray();

			Arrays.sort(a);
			Arrays.sort(a2);

			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(a2));

			if (Arrays.equals(a, a2) == true) {
				System.out.println("It's Anagram");
			}
			else 
			{
				System.out.println("It's not Anagram");

			}

		}

	}

}
