package CodingChallenges;

import java.util.Scanner;

public class StringDigitVlidation {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
	String s = "";
	int n=3;
	Scanner ab = new Scanner(System.in);
	
	while(n>0)
	{
		s = ab.nextLine();
		System.out.println("Input: "+s);
		System.out.println("output:"+stringDigit(s));
		n--;
	}
	
		
	}

	public static boolean stringDigit(String s) {
		// TODO Auto-generated method stub
		
		int count=0;
		char a[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
		Character.isDigit(a[i]);
		count++;
		}
		if (count==5) {
			
			return true;
			
		} else {
			return false;

		}
			

		
	}
	
}
