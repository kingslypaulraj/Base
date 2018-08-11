package InterviewQuestions;

import java.util.Scanner;

public class CountingOccurance {

	public static void main(String[] args) {
		
		int n,x,count=0,i=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to print");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the numbers");
		for (int j = 0; j < n; j++) {
			a[j] = s.nextInt();
		}
System.out.println("Enter the number that you want to find:");
x=s.nextInt();
for (int j = 0; j < n; j++) {
	if (a[j]==x) {
		count++;
	}
}System.out.println("Occurance is:"+count);
	}

}
