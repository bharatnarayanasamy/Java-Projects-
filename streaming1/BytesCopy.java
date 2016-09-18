package streaming1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class BytesCopy {


	public static void main(String[] args) throws IOException{

		FileInputStream fis = new FileInputStream("streaming1/sample.png");
		FileOutputStream fos = new FileOutputStream("streaming1/copy.png");

		byte[] bucket = new byte[500];
		int total = 0;
		
		while(true){

			int numOfBytesRead = fis.read(bucket);

			if(numOfBytesRead<=0){
				fis.close();
				fos.flush();
				fos.close();
				break;
			}
			total += numOfBytesRead;
			fos.write(bucket, 0, numOfBytesRead);
		
		}
		System.out.println(total);
		
		/**/
	}

}
