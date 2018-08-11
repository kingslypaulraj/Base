package CodingChallenges;

import java.util.Scanner;

public class PercentageStringPwd {

	public static void main(String[] args) {
	System.out.println("Enter the string:");
		Scanner ob = new Scanner(System.in);
		String s = ob.nextLine();
		int length = s.length();
		
		 float upperCase = 0, lowerCase=0,digit=0,specialChar=0;
		 for (int i = 0; i < s.length(); i++) {
			 if (Character.isUpperCase(s.charAt(i))) {
				 upperCase++;
			} 
			 if (Character.isLowerCase(s.charAt(i)))
			{
				 lowerCase++;
			}
			 if (Character.isDigit(s.charAt(i)))
			 {
				 digit++; 
			 }
			 if (Character.isLetterOrDigit(s.charAt(i)))	
			 {
				 specialChar++;
			 }
		}
		 
		 int length2 = s.length();
		 System.out.println("Total length is: "+length2);
		 System.out.println("Total upper Case is: " +upperCase);
		 System.out.println("Total lower  Case is: " +lowerCase);
		 System.out.println("Total igit is: " +digit);
		 System.out.println("Total special Char are:\n " +specialChar);
		 
		 System.out.println("Percentage of length is: "+(length2/length2)*100);
		 System.out.println("Total upper Case is: " +(upperCase/length2)*100);
		 System.out.println("Total lower  Case is: " +(lowerCase/length2)*100);
		 System.out.println("Total digit is: " +(digit/length2)*100);
		 System.out.println("Total special Char are:\n " +(specialChar/length2)*100);
		 
		 
	}

}
