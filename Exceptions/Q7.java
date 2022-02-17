package Exceptions;
//Write a program with finally block
public class Q7 {

	public static void main(String[] args) {
		try {
			int a=10/0;
		}catch(ArithmeticException e) {
			System.out.println("Catch called");
			System.out.println(e);
		}finally {
			System.out.println("finally called");
		}
	}

}
