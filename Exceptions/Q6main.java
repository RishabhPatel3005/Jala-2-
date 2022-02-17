package Exceptions;
//Write a program to create your own exception
public class Q6main {

	public static void main(String[] args) {
		try {
			throw new Q6("Jala Technologies");
		}catch(Q6 e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
