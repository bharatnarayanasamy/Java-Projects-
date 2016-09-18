package programmingBirthdayCandles;

import java.util.Scanner;

public class BirthdayCandles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int z;
		if(x>=64) z=7;
		else if(x>=32) z=6;
		else if(x>=16) z=5;
		else if(x>=8) z=4;
		else if(x>=4) z=3;
		else if(x>=2) z=2;
		else z=1;
		int[] y = new int[z];
		
		for(int i=0;i<z;i++){
			y[i] = x%2;
			x=x/2;
		}
		for(int i=z-1;i>=0;i--){
			System.out.print(y[i]);
		}
	}

}
