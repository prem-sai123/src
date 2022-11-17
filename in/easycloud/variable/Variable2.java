package in.easycloud.variable;

import java.util.Scanner;

public class Variable2 {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers: ");
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		double avg;

		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();

		avg = (double) (num1 + num2 + num3) / 3.0;
		System.out.println("The average is: " + avg);

	}
}