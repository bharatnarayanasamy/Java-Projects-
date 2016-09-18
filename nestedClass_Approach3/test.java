package nestedClass_Approach3;

// You dont do that - Use outer class to make the inner class
//import nestedClass_Approach3.nestedClass_Approach3.Buyer;


public class test {
	
	public static void main(String[] args){
		nestedClass_Approach3 n = new nestedClass_Approach3();
		nestedClass_Approach3.Buyer buyer = n.new Buyer();
	}

}
