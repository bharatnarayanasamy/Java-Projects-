package jrJava.arrayPractice;

public class Practice3 {

	public static void main(String[] args) {
		
		//int[] a = new int[5];
		//a[0] = -27;
		//a[1]=2*a[0];
		//a[a.length-2] = 101;
		//printAll(a);
		
		int[] myArray = generateArray(30);
		printAll(myArray);
		
		//int[] clone = cloneArray(myArray);
		//printAll(clone);
		
		//swap(myArray, 2,4);
		//printAll(myArray);
		
		//shiftLeft(myArray);
		//printAll(myArray);
		
		shiftRight(myArray);
		printAll(myArray);
	}
	
	public static void shiftLeft(int[] values){
		int temp = values[0];
		for(int i=0;i<=values.length-2;i++){
		values[i] = values[i+1];
		}
		values[values.length-1] = temp;
	}
	public static void shiftRight(int[] values){
		int temp = values[values.length-1];
		for(int i=values.length-2;i>=0;i--){
			values[i+1] = values[i];
		}
		values[0] = temp; 
	}
	
	
	
	public static void swap(int[] values, int index1, int index2){
		if(index1<0 || index1>=values.length ||
		   index2<0 || index2>=values.length ||
		   index1 == index2) return;
		
		int temp = values[index1];
		values[index1] = values[index2];
		values[index2] = temp;
	}
	
	
	public static void printAll(int[] values){
		for(int i=0;i<values.length;i++){
		System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	public static int[] generateArray(int length) {
		int[] a = new int[length];
		for(int i=0;i<length;i++){
			a[i] = (int) (Math.random()*100);
		}
		return a;
	}
	public static int[] cloneArray(int[] original) {
		int[] copy = new int[original.length];
		for(int i=0;i<original.length;i++){
			copy[i] = original[i];
		}
		return copy;
	}
}
