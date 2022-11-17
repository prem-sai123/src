package in.easycloud.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("RED", "BLUE", "BLACK", "GREEN", "BROWN");

		List<String> filteredList = new ArrayList<>();

		for (String entry : list) {
			if (entry.startsWith("B")) {
				filteredList.add(entry);
			}
		}

		System.out.println(filteredList);
	}
}
