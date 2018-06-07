import java.util.Scanner;

class Greater
{
	public static void great(int a , int b , int c)
	{
		if(a >= b && a >= c)
		{
			System.out.println(a+" is Greatest");
		}
		else if(b >= c && b >= a)
		{
			System.out.println(b+" is Greatest");
		}
		else if(c >= a && c >= b)
		{
			System.out.println(c+" is Greatest");
		}
	}
	
	public static void main(String args [])
	{
		int a , b , c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number A:");
		a = sc.nextInt();
		System.out.println("Enter a number B:");
		b = sc.nextInt();
		System.out.println("Enter a number C:");
		c = sc.nextInt();
		great(a,b,c);
	}
}