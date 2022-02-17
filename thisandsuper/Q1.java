package thisandsuper;
//Print the fields/instance members of the current class using this and without using object
public class Q1 {
	static String string;
	static int age;
	Q1(String string, int age){
		this.string=string;//this is used to represent current class. i.e. this.string==Q1.string
		this.age=age;//this is used to represent current class. i.e. this.age==Q1.age
	}
	static void print() {
		System.out.println("Name: "+string);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		Q1.string="Rishabh Patel";//Without using object
		Q1.age=21;//Without using object
		print();

	}

}
