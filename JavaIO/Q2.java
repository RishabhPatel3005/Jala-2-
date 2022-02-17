package JavaIO;
import java.io.*;
public class Q2 {
//Program to read the from the existing file
	public static void main(String[] args) {
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("Jala.txt"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(Exception ee) {
				ee.printStackTrace();
			}
		}

	}

}
