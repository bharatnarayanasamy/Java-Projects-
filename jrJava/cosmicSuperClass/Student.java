package jrJava.cosmicSuperClass;

import java.awt.Color;

public class Student {
	
	private int id;
	private double GPA;
	private Color favoriteColor;
	
	public Student(int id, double GPA, Color favoriteColor){
		
		this.id = id;
		this.GPA = GPA;
		this.favoriteColor = favoriteColor;
	}
	public Student(int id){
		
		this.id = id;
		this.GPA = 1.99;
		this.favoriteColor = Color.black;
	}
	
	
	// The following is the implementation of Object's equals() method
	// We should not rely on this.
	//public boolean equals(Object o){
		//return this==o;
	//}
	// The following is overriding of the equals() method.
	// We should always do like this.
	public boolean equals(Object o){
		Student student = (Student) o;
		return id==student.id &&
			   GPA==student.GPA &&
			   favoriteColor.equals(student.favoriteColor);
	}
	
	
}
