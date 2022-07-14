package Exception_demo;

import java.util.Scanner;

public class Except extends Except2
{
public static void main(String[] args)
{
	Except2 obj=new Except2();
	obj.sum();
	Except obj2=new Except();
	obj2.palindrom();
}
	public void palindrom()
	{
		int r ,num,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		
		try
		{
			
			System.out.println("Enter your number:");
			num=sc.nextInt();
			temp=sum;
			while(num>0)
			{
				r=num%10;
				sum=sum*10+r;
				num=num/10;
			}
			if(temp==sum)
			{
				System.out.println("palindrom:");
					}
			else
			{
				throw new Exception("Not a palindrome:");
				
			}
		
		}
			catch(Exception e)
			{
				System.out.println("My Exception:");
				System.out.println("e");
			}
			
		
}
}
