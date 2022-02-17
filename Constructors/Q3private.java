package Constructors;
//Apply private, public, protected and default access modifiers to the constructor
public class Q3private {
	private Q3private() {//private constructor, that means this constructor can be called only in this class not in other class irrespective of the fact that it's in same package
		System.out.println("Jala Academy");
	}

	public static void main(String[] args) {
		Q3private obj = new Q3private();

	}

}
