package in.easycloud.stringmani;

import java.util.Scanner;

public class String_Mani2 {

	public static String removeAllDigit(String str) {
		char[] charArray = str.toCharArray();
		String result = "";
		for (int i = 0; i < charArray.length; i++) {
			if (!Character.isDigit(charArray[i])) {
				result = result + charArray[i];
			}
		}

		return result;
	}

	public static void main(String args[]) {

		Scanner console = new Scanner(System.in);
		System.out.println("Enter Name 1: ");
		String input1 = console.nextLine();
		console.close();
		System.out.println(removeAllDigit(input1));

	}
}