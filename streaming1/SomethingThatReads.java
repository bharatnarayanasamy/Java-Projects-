package streaming1;

import java.io.*;

public class SomethingThatReads {

	//US_ASCII
	//UTF-8
	//UTF-16LE
	//UTF-16BE
	//ISO-8859-1
	//UNICODE
	
	public static void main(String[] args) throws IOException{

		FileInputStream fis = new FileInputStream("streaming1/test.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UNICODE");
		BufferedReader br = new BufferedReader(isr);

		String line;
		while(true){
			line = br.readLine();
			if(line==null) break;
			System.out.println(line);

		}
		br.close();

	}

}
