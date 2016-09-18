package networkPingPong;

public class ParsingPractice2 {

	public static void main(String[] args) {

		String msg = "12.3,35.01,  9.12 , 55.67, 42.09 ,1.002 ";
		
		String[] tokens = msg.split(",");
		
		double sum = 0.0;
		
		for(int i=0; i<tokens.length; i++){
			System.out.println(tokens[i]);
			sum += Double.parseDouble(tokens[i]);
		} 
		
		System.out.println(sum);
	}
 
}
