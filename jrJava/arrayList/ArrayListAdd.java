package jrJava.arrayList;

import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//list.add(new Integer(1));
		list.add(1);
		
		
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(9);
				
		System.out.println(list);
		
		insert(list, 0);
		System.out.println(list);
		insert(list, 6);
		System.out.println(list);
		insert(list, 11);
		System.out.println(list);
	}
	private static void insert(ArrayList<Integer> list, Integer toInsert){
		if(toInsert.compareTo(list.get(0))<=0){
			list.add(0, toInsert);
			return;
		}
		for(int i=1;i<list.size(); i++){
			if(toInsert.compareTo(list.get(i-1))>0 && toInsert.compareTo(list.get(i))<=0){
				list.add(i, toInsert);
				return;
			}
		}
		list.add(toInsert);
	}

}
