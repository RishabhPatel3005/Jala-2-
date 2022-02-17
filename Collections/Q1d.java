package Collections;

import java.util.ArrayList;

public class Q1d {

	public static void main(String[] args) {
		//Q1d. Remove an element from the ArrayList, Remove at an index
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
		mylist.set(3, "Patel");
		mylist.remove(3);
		for(String x: mylist) {
			System.out.println(x);
		}

	}

}
