package jrJava.exceptionHandling2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice1 {


	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		accessFile();

		/*
		try {
			accessFile();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		*/
	}


	private static void accessFile() throws FileNotFoundException, InterruptedException{
		System.out.println("Type in the file name: ");
		Scanner scanner = new Scanner(System.in);
		String typedInFileName = scanner.next();
		readFile(typedInFileName);

		/*
		try {
			readFile(typedInFileName);
		} catch (FileNotFoundException | InterruptedException e) {
			e.printStackTrace();
		}
		*/

	}


	private static void readFile(String fileName) throws InterruptedException, FileNotFoundException {

		Thread.currentThread().sleep(200000);

		String filePath = "jrJava/exceptionHandling2/" + fileName;
		File file = new File(filePath);

		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		System.out.println(line);
	}


	/*
	private static void readFile(String fileName){


		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			//
		}

		String filePath = "jrJava/exceptionHandling2/" + fileName;
		File file = new File(filePath);
		try {
			Scanner scanner = new Scanner(file);
			String line = scanner.nextLine();
			System.out.println(line);
		} 
		catch (FileNotFoundException e) {
			//
			//
		}

	 */

}
/*
	private static void readFile(String fileName){

		try{
			Thread.currentThread().sleep(2000);

			String filePath = "jrJava/exceptionHandling2/" + fileName;
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);

			String line = scanner.nextLine();
			System.out.println(line);
		}
		catch(InterruptedException e){
			//System.out.println("I am in the catch block and got pardoned");
			//
		}
		catch(FileNotFoundException e){
			//System.out.println("I am in the catch block and got pardoned");
		}

		//
		//
	}*/

/*
	private static void readFile(String fileName){

		try{
			Thread.currentThread().sleep(2000);

			String filePath = "jrJava/exceptionHandling2/" + fileName;
			File file = new File(filePath);
			Scanner scanner = new Scanner(file);

			String line = scanner.nextLine();
			System.out.println(line);
		}
		catch(Exception e){
			System.out.println("I got pardoned");
			//
		}

		//
		//
	}*/

