import java.util.Scanner;
public class swapping 
{

	public static void main(String[] args)
	{
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value x and y:");
		    x =sc.nextInt();
		    y =sc.nextInt();
		    
		    System.out.println("Before swapping a number: " + x + " " + y);
		    
		   z=x;
		   x=y;
		   y=z;
		   
		    System.out.println("After swapping a number:" + x + " " + y);
		    
		    System.out.print("");
		    
		    
		      
	}
}
