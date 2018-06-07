import java.util.Scanner;

class Reverse
{
	public static void rev(int z)
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
		System.out.println("Reverse of the number is: " +y1);
	}


	public static void main(String args [])
		{
			System.out.println("Enter a number:");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			rev(a);
		}
}