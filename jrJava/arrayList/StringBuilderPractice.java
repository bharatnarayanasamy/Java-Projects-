package jrJava.arrayList;

public class StringBuilderPractice {

	public static void main(String[] args) {
		
		String str1 = "aaa" + " " + "bbb" + " " + "ccc" + " " + "ddd";
		String str2 = "aaa".concat(" ").concat("bbb").concat(" ").concat("ccc").concat(" ").concat("ddd");
		System.out.println(str1);
		System.out.println(str2);
		
		//StringBuilder and StringBuffer
		
		StringBuilder sb = new StringBuilder();
		sb.append("aaa");
		sb.append(" ");
		sb.append("bbb");
		sb.append(" ");
		sb.append("ccc");
		sb.append(" ");
		sb.append("ddd");
		
		String all = sb.toString();
		System.out.println(all);
	}

}
