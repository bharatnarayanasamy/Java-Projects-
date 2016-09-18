package jrJava.recursion1;

import java.io.File;

public class FilePractice {

	public static void main(String[] args) {
		
		String path = "jrJava/recursion1/topDir_simple";
		
		String path2 = "C:/JrJavaLuna/eclipseWS/Student/jrJava/recursion1/topDir_simple";
		
		File file = new File(path2);
		
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());	
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		File[] childFiles = file.listFiles();
		
		for(int i=0;i<childFiles.length;i++){
			System.out.println(childFiles[i].getName() + " isDir:" + childFiles[i].isDirectory());
			System.out.println("size= " + (childFiles[i].isFile()? childFiles[i].length(): "N/A") );
		}
	}

}
