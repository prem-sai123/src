package in.easycloud.Operators;

import java.util.Scanner;

public class Operators2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print(" Please Enter the First Number : ");
		String s1 = sc.nextLine();
		System.out.print(" Please Enter the Second Number : ");
		String s2 = sc.nextLine();
		if (s1 == s2) {
			System.out.println(s1);
		} else {
			System.out.println(s2);
		}
	}
}