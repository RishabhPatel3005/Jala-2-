package thisandsuper;
//Call argument constructor of current class using this()

public class Q4main {
	String string="Jala Academy";
	Q4main(){
		Q4 obj = new Q4(this);
	}
	void display() {
		System.out.println(string);
	}

	public static void main(String[] args) {
		Q4main obj = new Q4main();

	}

}
