package hackveda.bhavesh.firstProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChainedException {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			
			// Standard Ideal Weight of a User = 50 + (0.91 × [height in centimeters − 152.4])
			 
			System.out.print("Please enter your height in cms: ");
			double height = sc.nextDouble();
			sc.close();
			
			double idealWeight = 50 + (0.91 * (height - 152.4));
			
			System.out.println("Your Ideal Weight is: " + idealWeight);
		}
		catch(InputMismatchException e) {
				throw new NumberFormatException();
		}
	}
}
