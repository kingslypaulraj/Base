package CodingChallenges;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum = 0;
for (int i = 1; i <= 100; i++) {
	if(i%3==0||i%5==0)
	{
		System.out.print(i+"|");
		sum += i;
	}
	
}
System.out.println();
System.out.println("The sum of given series is: "+sum);
	}

}
