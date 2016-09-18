package streaming1;

import java.io.*;

public class SomethingThatWrites {

	public static void main(String[] args) throws IOException {


		FileOutputStream fos = new FileOutputStream("streaming1/test.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "US-ASCII");
		PrintWriter pw = new PrintWriter(osw);

	
			pw.println("Hey!!!!!");
			pw.println("This is the first line.");
			pw.println("This is the second line.");
			pw.println("This is the third line.");
		


		pw.flush();
		pw.close();

		/*FileOutputStream fos = new FileOutputStream("streaming1/test.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.print("Hey!!!!!");
		bw.println("This is the first line.");
	    bw.println("This is the second line.");
		bw.println("This is the third line.");



		bw.flush();
		bw.close();*/

	}

}
