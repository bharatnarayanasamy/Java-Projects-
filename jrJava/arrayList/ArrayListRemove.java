package jrJava.arrayList;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);// auto boxing
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(9);
		list.add(10);
		list.add(1325345352);
		System.out.println(list);
		
		removeEven1(list);
		System.out.println(list);
		removeEven2(list);
		System.out.println(list);
	}
	
	private static void removeEven2(ArrayList<Integer> list){
		for(int i=list.size()-1;i>=0;i--){
			if(list.get(i)%2==0) list.remove(i);
		}
	}
	
	
	private static void removeEven1(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++){
			if(list.get(i)%2==0){
				list.remove(i);
				i--;
			}
		}
	}
	
}
