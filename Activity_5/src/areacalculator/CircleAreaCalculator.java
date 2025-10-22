package areacalculator;

import java.util.Scanner;

public class CircleAreaCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("== Circle Area Calculator ==");
        
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        double area = Math.PI * (radius * radius);
        
        System.out.printf("The area of the circle is: %.2f%n", area);
        
        input.close();
    }
}
