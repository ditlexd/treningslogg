package treningslogg;

import java.util.Calendar;
import java.util.Scanner;

public class Pull {
	private java.util.Date date; 
	private double deadLift;
	private double pullUps; 
	private double rows;
	private double cableCurl;
	private double facePull;
	private Scanner in = new Scanner(System.in);
	
	public Pull() {
		this.date = Calendar.getInstance().getTime();
		this.deadLift = getDeadLift();
		this.pullUps = getPullUps();
		this.rows = getRows();
		this.cableCurl = getCableCurl();
		this.facePull = getFacePull();
		
	}

	private double getFacePull() {
		print("How much did you facepull?");
		double d = in.nextDouble();
		if (d == 0) {
			return 0;
		}
		return in.nextDouble();
		
	}

	private double getCableCurl() {
		print("How much did you cable curl?");
		return in.nextDouble();
	}

	private double getRows() {
		return in.nextDouble();
		
	}

	private double getPullUps() {
		return in.nextDouble();
	}

	private double getDeadLift() {
		return in.nextDouble();
	}
	
	private void print(String s) {
		System.out.println(s);
	}

}

