package Exceptions;

import java.util.Scanner;
//Write a program to generate StringIndexOutOfBoundsException
public class Q17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text:");
		try {
			char c = scan.nextLine().charAt(4);
			System.out.println("The character at index 4 is "+c);
		}catch(Exception e) {
			System.out.println("Caught exception: "+e.toString());
		}
	}

}
