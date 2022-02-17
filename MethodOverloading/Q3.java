package MethodOverloading;
//Write two methods with the same name and same number of parameters of same type and call from main method
public class Q3 {
	static String method(String a, String b) {
		return a+b;
	}
	String method(String a, String b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(method("Intenrhsip at ","Jala Technologies"));
		Q3 obj = new Q3();
		System.out.println(obj.method("Intenrshp at ","Jala Academy"));

	}

}
