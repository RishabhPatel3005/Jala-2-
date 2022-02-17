package JavaIO;
import java.io.*;
public class Q1 {
//Program to create and write in the text file
	public static void main(String[] args) {
		try {
			File file = new File("Jala.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			pw.println("Internship at Jala Technologies");
			pw.println("Internhsip at Jala Academy");
			pw.println(420+":)");
			pw.close();
			System.out.println("done");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
