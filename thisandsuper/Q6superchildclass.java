package thisandsuper;
//Use this() and super() in methods not in constructors
public class Q6superchildclass extends Q6super{
	void method1() {
		System.out.println("I can't get internship");
	}
	void method2() {
		System.out.println("Jala Academy");
	}
	void method3() {
		super.method1();
		method2();
		System.out.println("Jala Technologies");
	}

}
