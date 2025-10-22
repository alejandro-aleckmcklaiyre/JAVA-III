package oddoreven;

import java.util.Scanner;

public class OddOrEvenChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int firstInput = input.nextInt();
		
		if ( firstInput % 2 == 0 ) {
			System.out.println(firstInput + " is even." );
		}
		else {
			System.out.println(firstInput + " is odd.");
		}
		
		input.close();
	}

}
