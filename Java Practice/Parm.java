package aBC;

import java.util.Scanner;

class Auto {
	void greeting(String name) {
		System.out.println("Hello there, " + name);
	}

	public void voteRight(String name, int age) {
		if (age < 18) {
			System.out.println(name + ", you are " + age + " and you are not eligible to vote");
		} else if (age > 18 && age < 100){
			System.out.println(name + ", you are " + age + " and have the right to vote");
		}
		else {
			System.out.println("Enter valid age");
		}
	}
}

public class Parm {

	public static void main(String[] args) {

		Auto wish = new Auto();
		Scanner input = new Scanner(System.in);

		String name;
		int age;

		System.out.println("Enter your name: ");
		name = input.nextLine();

		System.out.println("Enter your age");
		age = input.nextInt();

		wish.greeting(name);
		wish.voteRight(name, age);

	}

}
