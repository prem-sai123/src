package in.easycloud.arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays4 {

	
public static void main(String args[]) {

	List<String> al = new ArrayList<>();

	al.add("Jhansi");
	al.add("Shubhangi");
	al.add("Prabha");
	al.add("Sai");
	al.add("Obaid");

	System.out.println(al);
	String element =al.get(2);
	System.out.println("The element at index of 3 "+element);

}
}