package in.easycloud.stringmani;

public class String_Mani4 {

	public static void main(String args[]) {

		// Input character and string
		String str = " Shubhangi";
		String finalString = "";
		for (int i = 1; i <= 15; i++) {
			finalString = finalString.concat("X");
		}
		System.out.println(finalString.concat(str));
	}
}