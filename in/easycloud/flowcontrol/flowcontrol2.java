package in.easycloud.flowcontrol;

import java.util.Scanner;

public class flowcontrol2 {
	public static void main(String args[]) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		x = sc.nextInt();
		System.out.print("Enter the second number: ");
		y = sc.nextInt();
		System.out.print("Enter the third number: ");
		z = sc.nextInt();
		if(x+y+z==180) {
		System.out.println("It is a Valid Triangle");	
		}
		else {
			System.out.println("It is a Invalid Triangle");
		}
}
	
}