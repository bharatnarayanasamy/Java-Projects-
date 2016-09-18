package jrJava.arrayPractice;

public class Practice4 {
	
	
	public static void main(String[] args){
		/*Thing[] things = new Thing[5];
		things[0] = new Thing(100);
		things[1] = new Thing(101);
		for(int i=0;i<things.length;i++){
			System.out.println(things[i]);
		}
		for(int i=0;i<things.length;i++){
			if(things[i]==null) continue;
			things[i].aboutMe();
		}
		*/
		Thing[] a = generateArray(20);
		printAll(a);
	}
	
	
	
	public static void add(Thing[] things, Thing toBeAdded){
		
	}
	public static Thing remove(Thing[] things, int index){
		Thing toBeRemoved = things[index];
		for(int i=index;i<=things.length-2;i++){
			if(things[i]==null) break;
			things[i] = things[i+1];
		}
		
		return toBeRemoved;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	public static void printAll(Thing[] things){
		for(int i=0;i<things.length;i++){
			if(things[i]==null) System.out.print(things[i]+" ");
			else things[i].aboutMe();
		}
		System.out.println();
	}
	
	public static Thing[] generateArray(int length){
		Thing[] things = new Thing[length];
		for(int i=0;i<things.length/2;i++){
			things[i] = new Thing(i);
		}
		return things;
	}
	

}
