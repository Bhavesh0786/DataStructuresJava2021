package hackveda.bhavesh.firstProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter no 1: ");
			int a = sc.nextInt();
			
			System.out.print("Enter no 2: ");
			int b = sc.nextInt();
			sc.close();
			int d = add(a, b);
			System.out.println("The output is: " + d);
			} catch(InputMismatchException e) {
				System.out.println("Please enter integers only");
			} finally {
				System.out.println("Integers not found");
			}
		}

		private static int add(int a, int b) {
			
			int c = 0;
			
			try {
			c = a + b;	
			}
			catch(Exception e) {
				System.out.println("Please enter integers only");
			}
			finally {
				System.out.println("Finally executed");
			}
			return c;
			}
		
}
