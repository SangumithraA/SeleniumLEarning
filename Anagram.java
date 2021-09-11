package week2.Day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "stops";

		String s2 = "posts";

		boolean flag = true;

		if (s1.length() == s2.length()) {

			char[] a1 = s1.toCharArray();

			char[] a2 = s2.toCharArray();

			Arrays.sort(a1);

			Arrays.sort(a2);

			flag = Arrays.equals(a1, a2);

			System.out.print("The String are Anagram");

		}

	}

}
