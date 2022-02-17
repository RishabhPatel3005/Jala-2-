package Interfaces;
//Create an interface with a default method and implement it in a class. Do not provide implementation to the default method and call the method
public class Q6a implements Q6{
//It is mentioned in the question not to implement the method in the class.So naturally it throws error
	public static void main(String[] args) {
		Q6 obj = new Q6a();
		System.out.println(obj.method());

	}

}
