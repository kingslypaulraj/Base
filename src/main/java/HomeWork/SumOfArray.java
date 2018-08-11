package HomeWork;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0;
System.out.println("Enter how many numbers:");
Scanner scan = new Scanner(System.in);
n= scan.nextInt();
int a[] = new int[n];
System.out.println("Enter the numbers");
for(int i = 0;i<n;i++) {
	
	a[i]=scan.nextInt();
	sum = sum+a[i];
}
System.out.println("The sum of two numbers:"+sum);
	}
	


}