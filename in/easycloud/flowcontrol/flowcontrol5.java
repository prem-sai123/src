package in.easycloud.flowcontrol;

import java.util.Scanner;

public class flowcontrol5 {

	public static void main(String args[]) {
		int year;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a year");
		year = in.nextInt();

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is not a Leap Year");
	}
}