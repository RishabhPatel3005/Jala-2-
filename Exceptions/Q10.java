package Exceptions;
// Write a program to generate ClassNotFoundException
public class Q10 {

	public static void main(String[] args) {
		try {
			Class.forName("Jala Technologies");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
