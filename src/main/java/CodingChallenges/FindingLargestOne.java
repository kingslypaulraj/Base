package CodingChallenges;

import java.util.Scanner;

public class FindingLargestOne {

	public static void main(String[] args) {
		System.out.println("Enter the input number");
		Scanner num1 = new Scanner(System.in);
		int nextInt = num1.nextInt();
		
		System.out.println("Enter the digit number");
		Scanner num2 = new Scanner(System.in);
		int nextInt2 = num1.nextInt();
		
		int num3 = nextInt/100;
		int largest  = (num3*100)+(nextInt2*10);
		System.out.println(largest-1);
		
	}

}
