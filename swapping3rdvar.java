import java.util.Scanner;

public class swapping3rdvar

{

	
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value x and y:");
		    x =sc.nextInt();
		    y =sc.nextInt();
		    
		    System.out.println("Before swapping a number: " + x + " " + y);
		    
		  x=y;
		  y=x;
		    System.out.println("After swapping a number:" + x + " " + y);
		    
		    System.out.print("");
		    
		    
		      
	}
}


