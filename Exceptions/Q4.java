package Exceptions;
//Write a program with multiple catch blocks
public class Q4 {

	public static void main(String[] args) {
		try {
			int array[] = new int[5];
			array[5]=10/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
