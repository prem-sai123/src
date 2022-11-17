package in.easycloud.stringmani;

import java.util.Scanner;

public class String_Mani3 {

	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String input1 = console.nextLine();
		System.out.println("Enter Second String: ");
		String input2 = console.nextLine();
		System.out.println(input1.compareTo(input2));
		
	}
}