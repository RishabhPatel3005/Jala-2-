package Collections;
import java.util.*;
public class Q1 {
//Q1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList and perform the below operations
//Q1a. Add an element to the ArrayList
//Q1b. Iterate through the ArrayList by using Iterator object
//Q1c. Add an element at a specific index
//Q1d. Remove an element from the ArrayList, Remove at an index
//Q1e. Update the element at a specific index
//Q1f. Check the element is present at a particular index
//Q1g. Get an element at a particular index
//Q1h. Find out the size of the ArrayList
//Q1i. Check the given element is present in the ArrayList
//Q1j. Remove all elements of the ArrayList
	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>(10);
		mylist.add("Jala");
		mylist.add("Jala Academy");
		mylist.add("Jala Technologies");
		mylist.add("Internship");
		mylist.add("Jala Internship");
		mylist.add("Jala Academy Internship");
		mylist.add("Jala Technologies Internship");
		mylist.add("Internhsip at Jala Academy");
		mylist.add("Best Internhsip");
		mylist.add("Rishabh");
		for(String x: mylist) {
			System.out.println(x);
		}
	}

}
