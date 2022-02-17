package Interfaces;
//Create an interface with only one method and implement it in a class. Call the method implemented.
public class Question1 implements Q1{

	public static void main(String[] args) {
		Q1 obj = new Question1();//if we create an object of Q1 interface it can't be instantiated. therefore polymorphism is used
		System.out.println(obj.getintrestrate());

	}
	public int getintrestrate() {
		return 0;
	}

}
