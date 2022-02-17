package MethodOverloading;
//Write two methods with the same name but different number of parameters of same type and call the methods from main method
public class Q1 {
	static String method(String a) {//one parameter
		return a;
	}
	 String method(String a, String b) {//two parameters but with same name,return type
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(method("Jala Academy"));
		Q1 obj = new Q1();
		System.out.println(obj.method("Internship at", "Jala Technologies"));
	}

}
