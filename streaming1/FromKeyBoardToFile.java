package streaming1;

import java.io.*;

public class FromKeyBoardToFile {

	
	public static void main(String[] args) throws Exception {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("streaming1/sample.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		PrintWriter pw = new PrintWriter(osw);
		
		System.out.println("Begin to type in the text: (To stop type in 'qqqqq')");
		
		String line;
		while(true){
			line = br.readLine();
			if(line.indexOf("qqqqq")==0) break;
			System.out.println(line);
			pw.println(line);
		}
		
		pw.flush();
		pw.close();
		
		
	}

}
