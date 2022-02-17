package Collections;

import java.util.ArrayList;

public class Q1f {

	public static void main(String[] args) {
		//Q1f. Check the element is present at a particular index
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
		System.out.println(mylist.contains("Rishabh"));
	}

}
