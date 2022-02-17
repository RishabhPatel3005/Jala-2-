package Constructors;
//Apply private, public, protected and default access modifiers to the constructor
public class Q3public {
	public Q3public(){
		System.out.println("Jala Technologies");//This constructor can be called easily as it's public and public means accessible even outside the package
	}

	public static void main(String[] args) {
		Q3public obj = new Q3public();

	}

}
