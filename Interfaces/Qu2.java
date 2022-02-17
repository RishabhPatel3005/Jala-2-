package Interfaces;
//Create an interface with two methods, but implement only one in a class. Call the method implemented.
public class Qu2 implements Q2{
	public int method1() {
		return 10;
	}
	public static void main(String[] args) {
		Q2 obj = new Qu2();//polymorphism is used
		System.out.println(obj.method1());
	}


}
