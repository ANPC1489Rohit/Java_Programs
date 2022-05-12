
/*WAP to accept a no from user and check it is prime or not*/


import java.util.Scanner;

public class prime_num {
	
	public static void main(String[] args)
	{
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your number:\n");
		num = sc.nextInt();
		
		if(num%2==0)
		{
			
			System.out.println("This is prime number");
		}
		else
		{
			System.out.println("This is not prime number");
			
		}
		
	}
	

}
