package Exceptions;

public class Q2 {
//Handle the Arithmetic exception using try-catch block
	public static void main(String[] args) {
		try {
			int a=100/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("--------------------------------");

	}

}
