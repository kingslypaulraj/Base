package InterviewQuestions;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the numbers:");
		
		//to store the value that we are getting from the user
		Scanner d = new Scanner(System.in);
		int nextInt = d.nextInt();
		//random methode to generate random numbers
		Random c = new Random();
		
		for (int b = 0; b < nextInt; b++) {
			
			System.out.println(c.nextInt(100));//nextInt(bound)
		}
		
		
		
			}

}
