package Constructors;
//Try to call the constructor multiple times with the same object
public class Q5 {
	Q5(){
		System.out.println("Internship at Jala Academy");
	}

	public static void main(String[] args) {
		Q5 obj = new Q5();
		Q5 obj = new Q5();// if we use the object with same name , it will not be considered as object and it will become local variable and compiler will tell to declare this local variable

	}

}
