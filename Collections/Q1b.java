package Collections;

import java.util.ArrayList;

public class Q1b {

	public static void main(String[] args) {
		//Q1b. Iterate through the ArrayList by using Iterator object
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
		mylist.add("Error");
		for(String x: mylist) {//here x is the iterator object
			System.out.println(x);
		}

	}

}
