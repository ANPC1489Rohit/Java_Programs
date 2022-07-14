package Exception_demo;

import java.util.Scanner;

public class Except2 
{

	public void  sum()
	{
	int a = 0;
	int b = 0;
	int div;
	System.out.println("Enter two numbers");
	Scanner sc = new Scanner(System.in);
	try
	{
	    a = sc.nextInt();
	    b = sc.nextInt();
	    div=a/b;
	    System.out.println("res:" +div);
	} 
	catch (Exception ex) 
	{
	    System.out.println("Type number!");
	    System.out.println("ex");
	}
	}
}

