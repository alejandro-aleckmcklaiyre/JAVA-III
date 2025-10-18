package inputandvariable;

import java.util.Scanner;

public class UserIntroduction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input name
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		//input age
		System.out.print("How old are you: ");
		int age =  input.nextInt();
		
		input.nextLine();
		
		//input hobby
		System.out.print("What is your favorite hobby: ");
		String hobby = input.nextLine();
		
		input.close();
		System.out.println("---------------------------------------");
		
		System.out.println("Nice to meet you, " + name +"!");
		System.out.println("You are " + age + " years old and love " + hobby);
		
	}

}
