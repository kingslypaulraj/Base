package HomeWork;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int i,fact = 1;
	System.out.println("Enter the number");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	for( i = 1;i<=n ;i++)
	{
		fact = fact*i;
	}
	System.out.println("the factorial of the iven number is: "+fact);
	}

}
