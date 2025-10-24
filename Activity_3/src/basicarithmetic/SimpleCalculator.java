package basicarithmetic;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("== Simple Calculator ==");

		System.out.print("Enter first number: ");
		float firstInput = input.nextFloat();

		System.out.print("Enter Second number: ");
		float secondInput = input.nextFloat();

		float sum = firstInput + secondInput;
		float difference = firstInput - secondInput;
		float product = firstInput * secondInput;
		float quotient = firstInput / secondInput;
		float remainder = firstInput % secondInput;

		System.out.println("== Result ==");
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);

		input.close();
		}
}