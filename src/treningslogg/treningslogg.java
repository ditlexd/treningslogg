package treningslogg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class treningslogg {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Legs> legsList = new ArrayList<Legs>();
		String str = "";
		if (args.length == 0) {
			System.out.println("Please enter workout");
			str = in.nextLine();
		}

		if (str.equalsIgnoreCase("legs")) {
			Legs legs = new Legs("Sunday");
			legsList.add(legs);
			FileSerialization fs = new FileSerialization();
			fs.saveLegs(legs, "/home/ditlef/code/Java/treningslogg/files/legs.ser");
			Legs legsTwo = null;
			legsTwo = (Legs) fs.readFile();

			System.out.println(legsTwo);
		}

	}
}
