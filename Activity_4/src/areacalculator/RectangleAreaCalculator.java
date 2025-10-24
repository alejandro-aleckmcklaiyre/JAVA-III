package areacalculator;

import java.util.Scanner;

public class RectangleAreaCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("== Rectangle Area Calculator ==");

		System.out.print("Enter the length: ");
		float length = input.nextFloat();

		System.out.print("Enter the width: ");
		float width = input.nextFloat();

		float area = length * width;

		System.out.println("The area of the rectangle is: " + area);

		input.close();
	}

}
