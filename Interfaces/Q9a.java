package Interfaces;
//Create a PRIVATE or PROTECTED interface and print the values as above scenario
public class Q9a implements Q9{
	public int method() {
		return 123654789;
	}

	public static void main(String[] args) {
		Q9 obj = new Q9a();
		System.out.println(obj.method());
		System.out.println(obj.string);

	}

}
