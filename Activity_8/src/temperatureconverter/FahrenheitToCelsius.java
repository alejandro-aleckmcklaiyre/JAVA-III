package temperatureconverter;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature in Fahrenheit: ");
		float fahrenheit = input.nextFloat();

		float celcius = ( fahrenheit - 32 ) * 5 / 9;

		System.out.printf("Tempereature in Celcius: %.2f°C%n", celcius);
		input.close();
	}
}