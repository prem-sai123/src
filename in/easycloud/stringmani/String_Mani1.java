package in.easycloud.stringmani;

import java.util.Scanner;

public class String_Mani1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Name 1: ");
		String input1 = console.nextLine();
		System.out.println("Enter Name 2: ");
		String input2 = console.nextLine();
		console.close();
		String str3 = input1.concat(input2);
		System.out.println(input1 + "," + input2);
	}
}