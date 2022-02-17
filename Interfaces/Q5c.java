package Interfaces;
////Create two interfaces with the same method (same signature) in both the interfaces. Implement these two interfaces in one class. Call the method
public class Q5c implements Q5a,Q5b{
	public int method() {
		return 123456789;
	}

	public static void main(String[] args) {
		Q5a obj = new Q5c();
		Q5b obj1 = new Q5c();
		System.out.println(obj.method());
		System.out.println(obj1.method());

	}


}
