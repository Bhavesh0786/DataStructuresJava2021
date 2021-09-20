package hackveda.bhavesh.firstProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome to Max Heart Rate Calculator");
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please enter your age: ");
			int age = sc.nextInt();
			
			int maxheartrate = 220 - age;
			sc.close();
			
			System.out.println("Max Heart Rate is: " + maxheartrate);
			} catch(InputMismatchException e) {
				System.out.println("Please enter integer only");
			}
	}

}
