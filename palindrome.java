
public class palindrome 
{
	
	public static void main(String[] args)
	{
		
		int i , sum=0, temp;
		
		 i = 45;
		 temp=i;
		 
		 while(i>0)
		 {
			 
			 i=i%10;
			 sum=(sum*10)+i;
			 i=i/10;
		 }
		if(i==0)
		{
			System.out.println("Palindrome number");
		}
			else 
			{
				
				System.out.println("Not palindrome");
			}
		}
		
	}


