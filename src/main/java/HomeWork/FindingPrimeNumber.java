package HomeWork;

import java.util.Scanner;

public class FindingPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int num = 0;
		String primeNumbers = "";
		System.out.println("Enter the number:");
		Scanner prime = new Scanner(System.in);
		int n = prime.nextInt();
		for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	   }
	}
	
	
