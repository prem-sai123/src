package in.easycloud.Operators;

import java.util.Scanner;

public class Operators5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int a = input.nextInt();
		System.out.print("Input the second number: ");
		int b = input.nextInt();
		if(a>b) {
			System.out.println("a is greater than b");

		}
		else {
			System.out.println("a is smaller than b");
		}

		

	}

}
