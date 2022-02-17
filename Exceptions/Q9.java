package Exceptions;

public class Q9 {
//Write a program to generate ArrayIndexOutOfBoundException
	public static void main(String[] args) {
		int[] array = new int[3];
		array[4]=420;
		System.out.println(array[4]);

	}

}
