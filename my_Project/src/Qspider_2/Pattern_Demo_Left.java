package Qspider_2;

public class Pattern_Demo_Left 
{

	public static void main(String[] args)
	{
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=2*(n-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
