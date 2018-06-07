import java.util.Scanner;

class Palindrome
{
	public static void pal(int z)
	{
		int y = 0, y1 = 0;
		int x = 0;
		x = z;
		while(z != 0)
		{
			y = z % 10;
			z = z/10;
			y1 = y1*10 + y;
		}
		if (x == y1)
			System.out.println(y1 + " is a Palidrome");
		else
			System.out.println(x + " is not a Palindrome");
	}


	public static void main(String args [])
		{
			System.out.println("Enter a number:");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			pal(a);
		}
}