package areacalculator;

import java.util.Scanner;

public class RectangleAreaCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println(" == Rectangle Area Calculator == ");
		
		//input length
		System.out.print("Enter the length: ");
		double length = input.nextDouble();
		
		//input width
		System.out.print("Enter the width: ");
		double width = input.nextDouble();
		
		//calculation for area
		double area = length * width;
		
		System.out.println("The area of the rectangle is: " + area);
		
		input.close();
	}

}
