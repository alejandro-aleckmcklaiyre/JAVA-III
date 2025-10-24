package areacalculator;

import java.util.Scanner;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Base: ");
		float base = input.nextFloat();

		System.out.print("Enter Height: ");
		float height = input.nextFloat();

		float area = 0.5f * base * height;

		System.out.println("The area of the triangle is: " + area);
		input.close();
	}

}