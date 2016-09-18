package jrJava.cosmicSuperClass;

import java.awt.Color;
import java.util.ArrayList;

public class Test {


	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add( new Student(101, 2.02, Color.red) );
		list.add( new Student(102, 2.02, Color.red) );
		list.add( new Student(103, 2.02, Color.red) );
		list.add( new Student(104, 2.02, Color.red) );
		
		Student toSearch = new Student(102, 2.02, Color.red);
		
		String description = toSearch.toString();
		System.out.println(description);
		
		for(int i=0;i<list.size();i++){
			Student each = list.get(i);
			if(each.equals(toSearch)){
				System.out.println("I found it. ");
			}
		}
		
		System.out.println("I am done.");
	}

}
