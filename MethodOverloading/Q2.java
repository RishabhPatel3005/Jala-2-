package MethodOverloading;
//Write two methods with the same name but different number of parameters of different data type and call the methods from main method
public class Q2 {
	static int method(int a) {
		return a;
	}
	static void method() {
		System.out.println("Internhsip at Jala Academy");
	}

	public static void main(String[] args) {
		System.out.println(method(10));
		method();

	}

}
