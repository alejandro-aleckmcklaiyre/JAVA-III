package basicarithmetic;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

	 System.out.println("== Simple Calculator ==");
	
	 //1st input
	 System.out.print("Enter first number: ");
	 double firstInput = input.nextDouble();
	
	 //2nd input
	 System.out.print("Enter Second number: ");
	 double secondInput = input.nextDouble();
	 
	 //operations
	 double sum = firstInput + secondInput;
	 double difference = firstInput - secondInput;
	 double product = firstInput * secondInput;
	 double quotient = firstInput / secondInput;
	 double remainder = firstInput % secondInput;
	 
	 //Display Result
	 System.out.println("== Result ==");
	 System.out.println("Sum: " + sum);
	 System.out.println("Difference: " + difference);
	 System.out.println("Product: " + product);
	 System.out.println("Quotient: " + quotient);
	 System.out.println("Remainder: " + remainder);
	 
	 input.close();
	}

}
