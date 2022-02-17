package Interfaces;
////Create a PUBLIC interface with fields and methods, fields should have values assigned. Implement this interface to some class and print the values of the interface fields and call the interface methods
public class Q8a implements Q8{
	public int method1() {
		return 987654321;
	}
	public String method2() {
		return "Jala Technologies";
	}

	public static void main(String[] args) {
		Q8 obj = new Q8a();
		System.out.println(obj.method1());
		System.out.println(obj.method2());
		System.out.println(obj.number);
		System.out.println(obj.string);

	}

}
