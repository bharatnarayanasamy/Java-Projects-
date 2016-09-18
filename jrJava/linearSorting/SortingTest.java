package jrJava.linearSorting;

public class SortingTest {
	
	
	public static void main(String[] args) {

		int[] a = {21, 5, 11, 3, 17, 20, 15, 19, 11, 15, 12, 7, 1, 3, 1};
		
		Sorter sorter = new Sorter();
		
		sorter.printAll(a);
		sorter.insertSort(a);
		sorter.printAll(a); 
		
		
	}
}
