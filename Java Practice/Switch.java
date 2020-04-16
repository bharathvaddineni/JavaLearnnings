package aBC;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
        System.out.println("Please enter a number: ");
        int i = input.nextInt();
 
        switch (i) {
        case 5 :
            System.out.println("Number is less than 10");
            break;
 
        case 11 :
            System.out.println("Number is greater than 10");
            break;
 
        default:
            System.out.println("Unrecognizable");
        }


	}

}
