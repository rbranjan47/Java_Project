package Qspider_1;

import java.util.Scanner;

public class leap_year 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any year to check leap: ");
		int year=sc.nextInt();
		
		if (year%400==0 || year%4==0 && year%100!=0)
		{
			System.out.println("leap year");
		}
		else 
			System.out.println("not a leap year");

		sc.close();
	}

}
