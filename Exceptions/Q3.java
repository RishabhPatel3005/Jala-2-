package Exceptions;
//Write a method which throws exception, Call that method in main class without try block
public class Q3 {
	static void method() {
		int a=10/0;
		System.out.println(a);
	}

	public static void main(String[] args) {
		method();

	}

}
