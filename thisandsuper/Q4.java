package thisandsuper;
//Call argument constructor of current class using this()

public class Q4 {
	Q4main obj;
	Q4(Q4main obj){
		this.obj=obj;
		obj.display();
	}

}
