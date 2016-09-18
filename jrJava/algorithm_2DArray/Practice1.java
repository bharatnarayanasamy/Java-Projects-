package jrJava.algorithm_2DArray;


public class Practice1 {

	
	public static void main(String[] args) {
		
		int[][] a = new int[4][3];
		a[0][0] = 9;
		a[2][1] = 12;
		a[a.length-1][a[a.length-1].length-1] = -1;
		
		
		int[][] b = {{1,2,3}, {4,5}, {6,7,8,9}};
		
		int[][] c = new int[3][];
		c[0] = new int[]{7,4,1,-3};
		c[1] = new int[]{5};
		c[2] = new int[]{6,8,-2};

		
		/*for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] = i;
			}
		}*/
		printAll(c);
		
	}
	
	
	
	
	public static void printAll(int[][] values){
		for(int i=0;i<values.length;i++){
			for(int j=0;j<values[i].length;j++){
				System.out.print(values[i][j] + " ");
			}
			System.out.println();
		}
	}
}
