package in.easycloud.Operators;

import java.util.Scanner;

public class Operators1 {

	public static void main(String[] args) {
		int number1, number2;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Please Enter the First Number : ");
		number1 = sc.nextInt();

		System.out.print(" Please Enter the Second Number : ");
		number2 = sc.nextInt();

		if (number1 > number2) {
			System.out.println("The Largest Number = " + number1);
		} else if (number2 > number1) {
			System.out.println("The Largest Number = " + number2);
		} else {
			System.out.println("Both are Equal");
		}
	}
}