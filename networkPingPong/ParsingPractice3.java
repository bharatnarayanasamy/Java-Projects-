package networkPingPong;

public class ParsingPractice3 {

	public static void main(String[] args) {

		String msg = "B:120,207,3,-2";
		
		int colon, comma1, comma2, comma3;
		
		colon = msg.indexOf(':');
		comma1 = msg.indexOf(',');
		comma2 = msg.indexOf(',', comma1+1);
		comma3 = msg.indexOf(',', comma2+1);
		
		Integer.parseInt(msg.substring(colon+1, comma1));
		Integer.parseInt(msg.substring(comma1+1, comma2));
		Integer.parseInt(msg.substring(comma2+1, comma3));
		Integer.parseInt(msg.substring(comma3+1));
	}

}
