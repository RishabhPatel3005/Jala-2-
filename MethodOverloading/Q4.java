package MethodOverloading;
//Write two methods with the same name and same number of parameters of different type and call from main method
public class Q4 {
	static int method(int a, int b) {
		return a+b;
	}
	static String method(String a, String b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(method(400,20));
		System.out.println(method("Intenrhsip at ","Jala Academy"));

	}

}
