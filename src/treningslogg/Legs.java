package treningslogg;

import java.util.Calendar;
import java.util.Scanner;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;

public class Legs {
	private java.util.Date date; 
	private double squat;
	private double romanian; 
	private double press;
	private Scanner in = new Scanner(System.in);
	
	public Legs() {		
		this.date = Calendar.getInstance().getTime();
		this.squat = getSquat();
		this.romanian = getRomanian();
		this.press = getPress();
	}

	private double getPress() {
		System.out.println("How much did you LEGPRESS?");
		return in.nextDouble();

	}

	private double getRomanian() {
		System.out.println("How big was your ROMANIAN DEADLIFT?");
		return in.nextDouble();
	}

	private double getSquat() {
		System.out.println("How much did you SQUAT?");
		return in.nextDouble();
	}
	
	public String toString() {
		return ("Date: " + date + " Squat: " + squat);
	}

}
