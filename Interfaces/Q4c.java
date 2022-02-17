package Interfaces;
//Create two interfaces with one method each. Implement these two interfaces in one class.
public class Q4c implements Q4a,Q4b{
	public String method1() {
		return "Jala Technologies";
	}
	public int method2() {
		return 123;
	}

	public static void main(String[] args) {
		Q4a obj = new Q4c();
		Q4b obj1 = new Q4c();
		System.out.println(obj.method1());
		System.out.println(obj1.method2());

	}

}
