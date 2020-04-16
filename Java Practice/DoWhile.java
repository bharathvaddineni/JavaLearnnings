package aBC;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
         
	        
	        int i = 0;
	        do {
	            System.out.println("Enter a number: ");
	            i = scanner.nextInt();
	        }
	        while(i != 10);
	         
	        System.out.println("Got 10!");
	    

	}

}
