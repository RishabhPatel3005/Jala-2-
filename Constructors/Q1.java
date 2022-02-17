package Constructors;
//Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to call all the constructors of that class from a main class
public class Q1 {
	int length, height, breadth;
	public int returnvolume() {
		return (length*breadth*height);
	}
	Q1(){//default constructor
		length=10;
		breadth=20;
		height=30;
	}
	Q1(int l, int b, int h){//constructor with arguments and also a case of constructor overloading
		length=l;
		breadth=b;
		height=h;
	}

}
