package Collections;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		//Create a HashSet with at least 10 elements of type String. Write program covering all the operations of HashSet
		HashSet<String> hash = new HashSet<String>(10);
		hash.add("Rishabh");
		hash.add("Patel");
		hash.add("Rishabh Patel");
		hash.add("Jala");
		hash.add("Jala Academy");
		hash.add("Java Technologies");
		hash.add("Internship");
		hash.add("Internship at Jala Academy");
		hash.add("Internship ath Jala Technologies");
		hash.add("Internship at Jala Academy and Technologies");
		Iterator<String> itr = hash.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
