package thisandsuper;
//Use this() and super() in methods not in constructors
public class Q6this {
	void method1(Q6this obj) {
		System.out.println("Jala Technologies");
	}
	void method2() {
		method1(this);
	}
	public static void main(String[] args) {
		Q6this object = new Q6this();
		object.method2();

	}

}
