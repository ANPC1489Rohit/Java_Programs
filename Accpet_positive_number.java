import java.util.Scanner;
public class Accpet_positive_number
{

	public static void main(String[] args)
	{
		int i,sum=0;
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter your number:");
		i=sc.nextInt();
	 
		for(i=1; i<20; i++)  
		{  
		 
		sum = sum + i;  
		}  
		System.out.println("Sum of positive Numbers is = " + sum);  
		}  
		 
		
	
}

