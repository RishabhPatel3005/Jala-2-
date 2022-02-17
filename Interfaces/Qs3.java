package Interfaces;
//Use Interface instances to call the implemented method in the implemented class
public class Qs3 implements Q3{
	public int method1() {
		return 100;
	}
	public String method2() {
		return "Jala Academy";
	}

	public static void main(String[] args) {
		System.out.println(obj.method1());
		System.out.println(obj.method2());
		//it will not be able to print because error occurs in its interface as object can't be created

	}

}
