package networking2;

import java.io.*;
	
	
	public class MessageSender {
		

		private PrintWriter pw;
		
		
		public MessageSender(OutputStream os){
			
			OutputStreamWriter osw = new OutputStreamWriter(os);
			pw = new PrintWriter(osw);
			
		}
		
		public void send(){
			
			//prepare a br that can read the keyboard writing
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			while(true){
				//receive a text from keyboard. push that into pw.
				try {
					line = br.readLine();
					if(line.indexOf("stop") == 0) break;
					pw.println(line);
					pw.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
			
			pw.close();
		}
}
