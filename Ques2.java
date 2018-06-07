import java.util.Scanner;

class Year
{
	public static void leap(int year)
	{
		if ( year%400 == 0)
		System.out.println("Leap year");
	  else if ( year%100 == 0)
		System.out.println("Not a leap year.");
	  else if ( year%4 == 0 )
		System.out.println("Leap year.");
	  else 
		System.out.println("Not a leap year.");
	}
	
	public static void main(String [] args)
	{
		int a = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a year:");
		a = sc.nextInt();
		leap(a);
	}
}
