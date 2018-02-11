package treningslogg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class treningslogg {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		3ArrayList<Legs> legsList = new ArrayList<Legs>();
		String str = "";
		if (args.length == 0) {
			System.out.println("Please enter workout");
			str = in.nextLine();
		}

		for (int i = 0; i < 3; i++) {

			if (str.equalsIgnoreCase("legs")) {
				Legs legs = new Legs();
				legsList.add(legs);
			}

		}
		for (int i = 0; i < 3; i++) {
		System.out.println(legsList.get(i));
		}
	}

}
