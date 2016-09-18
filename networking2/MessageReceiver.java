package networking2;

import java.io.*;


	
	public class MessageReceiver implements Runnable{

		private BufferedReader br;
		
		public MessageReceiver(InputStream is){
			
			// prepare the buffered reader
			
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
		}
		
		public void run() {
			receive();
		}
		
		public void receive(){
			
			String message;
			while(true){
				try {
					message = br.readLine();
					if(message.indexOf("stop") == 0 ) break;
					System.out.println(message);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				// receive a text from BufferedReader. Display it on the console
			
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	
	
	
	
}
