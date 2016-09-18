package jrJava.basics;

public class BasicOperations {

	public static void main(String[] args) {

		int theX;
		int theY;
		
		theX = 11;
		theY = 22;
		
		
		theY = theX + 2*theY - 5;
		System.out.println(theY);
		
		// -------------------------------------------------------------------
		
		double xxx;
		xxx = 1.5;
		
		double xyz;
		xyz = -1.5;
		
		double sum;
		sum = xxx - xyz;
		
		System.out.println(sum);
		
		//---------------------
		
		boolean isSirHandsome;
		isSirHandsome = true;

	
		boolean areYouSmart;
		areYouSmart = false;
		
		boolean theTruth;
		theTruth = isSirHandsome && areYouSmart;
		
		boolean anotherTruth;
		anotherTruth = isSirHandsome || areYouSmart;
		
		System.out.println(theTruth);
		System.out.println(anotherTruth);
		
		//--------------------------------------------------------
		//Initialization:
		
		int myGrade = 55;
		
		double pi = 3.1415;
		
		boolean isVoiceOFSirBeautiful = true;
		
		char myMathScore = 'A';
		
	
	
	}

}
