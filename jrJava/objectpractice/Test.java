package jrJava.objectpractice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		ball ref = new ball();
		
		Scanner scanner = new Scanner(System.in);
		
		for(; true;){
			
			System.out.println("Type 1 to move and type 2 to grow");
			int typed = scanner.nextInt();
			
			if(typed==1){
				ref.move();
			}
			else if(typed==2){
				ref.grow();
			}
		
			System.out.println("x:" + ref.x + " y:" + ref.y + " r:" + ref.radius);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}	
		//ball ref = new ball();
		/*bored();
		//ref.vx = ref.vx + 2;
	}

	private static void bored(){
		
		ball ref = new ball();
		
		ref.x = ref.x + 10;
		
		System.out.println(ref);
	}
	
	*/
}
