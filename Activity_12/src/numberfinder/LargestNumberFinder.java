package numberfinder;

import java.util.Scanner;

public class LargestNumberFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstInput = input.nextInt();

		System.out.print("Enter second number: ");
		int secondInput = input.nextInt();

		System.out.print("Enter third number: ");
		int thirdInput = input.nextInt();

		if (firstInput == secondInput && secondInput == thirdInput) {
            System.out.println("All numbers are equal.");
        }
        else if (firstInput == secondInput && firstInput > thirdInput) {
            System.out.println("The first and second numbers are equal and largest: " + firstInput);
        }
        else if (firstInput == thirdInput && firstInput > secondInput) {
            System.out.println("The first and third numbers are equal and largest: " + firstInput);
        }
        else if (secondInput == thirdInput && secondInput > firstInput) {
            System.out.println("The second and third numbers are equal and largest: " + secondInput);
        }
        else if (firstInput > secondInput && firstInput > thirdInput) {
            System.out.println("The largest number is: " + firstInput);
        }
        else if (secondInput > firstInput && secondInput > thirdInput) {
            System.out.println("The largest number is: " + secondInput);
        }
        else {
            System.out.println("The largest number is: " + thirdInput);
        }

		input.close();
	}
}