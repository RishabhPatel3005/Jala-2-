package MethodOverloading;
//Write two methods with the same name, number of parameters and data type but different return Type
public class Q5 {
	static String method(String a, String b) {
		return a+b;
	}
	static int method(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(method(54,15));
		System.out.println(method("Internshp"," at jala academy"));

	}

}
