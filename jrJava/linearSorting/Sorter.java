package jrJava.linearSorting;


public class Sorter {

	
	
	public void min(int[] values){
		
		int min = values[0];
		
		for(int i=1; i<values.length; i++){
			if(values[i]<min)  min = values[i];
		}
		System.out.println(min);
	}
	public void minIndex(int[] values){
		int minIndex = 0;
		for(int i=1;i<values.length;i++){
			if(values[i]<values[minIndex]) minIndex = i;
		}
		System.out.println(minIndex);
	}
	
	public void insertSort(int[] values){
		int j, temp;
		// we need to increase the window.
		// 'i' is the ending index of the increasing window
		for(int i=1;i<values.length;i++){
			// window range: [0, i]
			// the new guy: values[i] at i.
			// all elements in [0, i-1] are already sorted
			// we need to decide where the new guy needs to be inserted
			// insertion algorithm
			temp = values[i];
			for(j=i-1;j>=0;j--){
				
				if(values[j]>temp){ 
					values[j+1] = values[j];
				}
				else{
					break;
				}
				
			}
	
			// we insert the new guy, values[i] to that position
			values[j+1] = temp;
		
		}
	}
	
	
	
	public void selectSort(int[] values){
		//we need to shrink the window one index at a time
		//'i' is the beginning index of the shrinking window
		int j, temp;
		if(values==null) return;
		for(int i=0;i<=values.length-2;i++){
			// window range: [i, length-1]
			// select the minIndex in the window.
		    int minIndex = i;
		    
		    for(j=i+1;j<values.length;j++){
		    	if(values[j]<values[minIndex]) minIndex = j;
		    }
		    
			// swap the values[minIndex] with values[i].
		    temp = values[minIndex];
		    values[minIndex] = values[i];
		    values[i] = temp;
		}
	
	
	
	}
	
	
	
	public void bubbleSort(int[] values){
		
		if(values==null) return;
		
		int i, temp;
		boolean sorted = false;
		while(!sorted){   //while(sorted==false){
			
			sorted = true;
			// 'i' is the beginning of the window of size 2.
			for(i=0; i<=values.length-2; i++){
				if(values[i]>values[i+1]){
					temp =values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					sorted = false;
				}
			}
		}
	}
	
	
	public void printAll(int[] values){
		
		if(values==null) return;
		for(int i=0; i<values.length; i++){
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
}
