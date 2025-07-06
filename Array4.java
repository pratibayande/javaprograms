package module1;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a first word to check Anagram");
		String s1 = s.nextLine();

		System.out.println("Enter a second word to check Anagram");
		String s2 = s.nextLine();

		if ((s1.length()) != s2.length()) {
			System.out.println("Since length is not same, it can never be Anagram");

		}

		else {
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();

			Arrays.sort(a1);
			Arrays.sort(a2);

			System.out.println(Arrays.toString(a1));
			System.out.println(Arrays.toString(a2));

			if (Arrays.equals(a1, a2) == true) {
				System.out.println("Give both words are Anagram");
			} else {
				System.out.println("Given words are not Anagram");
			}
			s.close();

		}

	}

}
