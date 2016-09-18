package reverseNumbersAndSquares;

public class Reverse {

	public static void main(String[] args) {
		
	
		int reverse = 0;
		for(int i=11;i<500;i++){
			reverse = reverse * 10;
	        reverse = reverse + i%10;
	        i = i/10;
	        
		}
		
	}

}
