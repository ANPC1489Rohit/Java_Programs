/*WAP to accept a no from user and check it is Armstrong or not*/

import java.util.Scanner;

public class armstrong 

{

	public static void main(String[] args)
	{
	    int num,r,s=0,num1;
		Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter your number:");
		num=sc.nextInt();
		
		num1=num;
		do
		{
			r=num%10;
			s=s+r*r*r;
			num=num/10;
		}while(num>0);
		{
			if(num1==s)
			{
				System.out.println("This is a armstrong number");
				
			}
			else
			{
				System.out.println("This is not armstrong number");
			}
			
		}
		
		
	}
	
}
