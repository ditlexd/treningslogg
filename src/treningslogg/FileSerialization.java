package treningslogg;

import java.io.*;

public class FileSerialization {
	private int i;
	
	public FileSerialization() {
		this.i = 1;
	}
	
	public  void saveLegs(Legs legs, String fileName) {
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(legs);
			oos.close();
			System.out.println("File created");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

	public Object readFile() {
		Legs l = null;
		try {
			FileInputStream fileIn = new FileInputStream("/home/ditlef/code/Java/treningslogg/files/legs.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			l = (Legs) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return null;
		}

		return l;
	}
	

}
