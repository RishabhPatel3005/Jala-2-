package Exceptions;
//Write a program to throw exception with your own message
public class Q5 {
	public static void eligible(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible for internship at jala academy");
		}
		else {
			System.out.println("Person is eligible for internship at Jala Technologies");
		}
	}

	public static void main(String[] args) {
		eligible(15);

	}

}
