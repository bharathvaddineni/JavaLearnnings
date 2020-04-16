package aBC;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int value = input.nextInt();
		System.out.println("The number you entered: " + value);

		System.out.println("Enter a decimal: ");
		double d = input.nextDouble();
		System.out.println("The decimal you entered: " + d);

		System.out.println("Enter a line: ");
		String text = input.nextLine();
		System.out.println("The line you entered: " + text);

	}

}
