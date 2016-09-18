package jrJava.algorithm_2DArray;

public class Practice2 {

	
	public static void main(String[] args) {
		
		String[][] words = new String[3][4];
		words[1][2] = "Hello";
		
		printAll(words);
	}
	
	
	public static void printAll(String[][] tokens){
		for(int i=0;i<tokens.length;i++){
			for(int j=0;j<tokens[i].length;j++){
				System.out.print(tokens[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}
