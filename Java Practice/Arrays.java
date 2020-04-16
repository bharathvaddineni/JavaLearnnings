package aBC;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
         
	        int[] n;
	        Scanner input = new Scanner(System.in);
	        n = new int[3];
	         
	        System.out.println(n[0]);
	        System.out.println(n[1]);
	        System.out.println(n[2]);
	         
	        for(int i=0; i < n.length; i++) {
	            System.out.println("Enter entry " + i + ":");
	            n [i] = input.nextInt();
	        }
	        
	        for(int i=0; i < n.length; i++) {
	            System.out.println(n[i]);
	        }
	         
	        int[] numbers = {5, 6, 7};
	         
	        for(int i=0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }


	}

}
