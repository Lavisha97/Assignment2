import java.util.Scanner;

class Pattern
{
	public static void pat(int a)
	{
		int i = 0 , j = 0;
		for(i = a ; i >= 0 ; i--)
		{
			for(j = 0 ; j <= i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String args [])
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		pat(a);
	}
}