package jrJava.thisIsThisPractice;

public class Thing {
	
	private int id;
	public Thing(int id){
		this();
		this.id = id;
	}
	
	public Thing(){
		
		 
	}
	
	public void aboutMe()
	{
		System.out.print("id="+id+" ");
		System.out.println(this);
	} 
}
