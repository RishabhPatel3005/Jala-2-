package Constructors;
//Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to call all the constructors of that class from a main class
public class Q1main {

	public static void main(String[] args) {
		Q1 obj = new Q1();
		System.out.println(obj.returnvolume());
		Q1 obj1 = new Q1(10,10,10);
		System.out.println(obj1.returnvolume());

	}

}
