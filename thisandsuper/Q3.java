package thisandsuper;
//Call constructor of the current class using this()
public class Q3 {
	Q3(){
		System.out.println("Jala Academy");
	}
	Q3(String string){
		this();//calling constructor of current class using this
		System.out.println(string);
	}

}
