package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDiagnal {

	public static void main(String[] args) {
		
		int row=4;
		int col = 4;
		int a[][]=new int[row][col];
		Scanner ob = new Scanner(System.in);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		for (int i = 0; i < row; i++) {
			for(int j=0;j<col;j++)
			{
				a[i][j]=ob.nextInt();
			}
			
		}
System.out.println("In the Matrix form:");
for (int i = 0; i < row; i++) {
	for (int j = 0; j < col; j++) {
		System.out.println(a[i][j]+"");
		
	}
	System.out.println();
	
}
System.out.println();
	}

}
