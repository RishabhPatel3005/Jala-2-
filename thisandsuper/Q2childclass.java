package thisandsuper;
//Print the fields/instance members of the parent class using super
public class Q2childclass extends Q2parentclass{
	String name="Patel";
	void method() {
		System.out.println(super.name);
		System.out.print(name);
	}

}
