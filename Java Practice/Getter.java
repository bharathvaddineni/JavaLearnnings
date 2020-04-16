package aBC;

import java.util.Scanner;

class interest {
	int principle;
	double rtopm;
	int months;

	double calculateInterest() {
		double intcal = ((principle * rtopm * months) / 100);
		return intcal;

	}
}

public class Getter {

	public static void main(String[] args) {
		
		interest p1 = new interest();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the principle amount:");
		p1.principle = input.nextInt();
		
		System.out.println("Enter the rate of interest");
		p1.rtopm = input.nextDouble();
		
		System.out.println("ENter number of months");
		p1.months = input.nextInt();

		double totint = p1.calculateInterest();
		System.out.println("Total interest to be paid by p1: " + totint);

	}

}
