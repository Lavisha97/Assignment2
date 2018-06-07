import java.util.Scanner;
class Add
{
	public static void adding(int a , int b)
		{
			int c = a+b;
			System.out.println("Sum of two numbers is:"+c);
		}
	public static void main(String [] args)
	{
		int a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number A:");
		a = sc.nextInt();
		System.out.println("Enter a number B:");
		b = sc.nextInt();
		adding(a,b);
	}
}