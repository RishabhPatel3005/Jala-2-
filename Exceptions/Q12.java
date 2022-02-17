package Exceptions;

import java.io.*;
//Write a program to generate IOException
public class Q12 {
//This program contains both FileNotFoundException and IOException
	public static void main(String[] args) {
		FileReader reader = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(reader);
		String data=null;
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();

	}

}
