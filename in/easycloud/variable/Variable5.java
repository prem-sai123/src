package in.easycloud.variable;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Variable5 {

	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // reads the date of birth from the user

        System.out.print("Enter the first name: ");
        String st=scanner.nextLine();

		System.out.print("Enter the age: ");
		int age=scanner.nextInt();
		System.out.println("Enter current year:");
		int yr=scanner.nextInt();
		System.out.println("Hello "+st+" " +"your birth of year is " +(yr-age));

	}
}