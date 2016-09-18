package networkPingPong;

import java.util.StringTokenizer;

public class ParsingPractice1 {

	public static void main(String[] args) {

		String msg = "12.3,35.01 9.12,55.67:42.09 1.002";
		
		StringTokenizer st = new StringTokenizer(msg, ", :");
		String token;
		
		double sum = 0.0;
		
		while(st.hasMoreTokens()){
			token = st.nextToken();
			System.out.println(token);
			sum += Double.parseDouble(token);
		}
		
		System.out.println(sum);
	}

}
