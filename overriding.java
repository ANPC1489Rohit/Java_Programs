package overriding;

import java.util.Scanner;

public class overriding 
{
public static void main(String[] args)
{
	overriding sc=new overriding();
	sc.factorial();
	sc.fibonacci();
	
}
public void factorial()
{
	int i=0,fact=1;

	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your number:");
	   i=sc.nextInt();
	   fact=sc.nextInt();
	      fact=fact*i;    
	      System.out.println("Factorial of "+fact);
	  }  

public void  fibonacci () 
{
	int n1=0,n2=1,n3,i,count=10;    
	 System.out.print(n1+" "+n2);
	    
	 for(i=2;i<count;++i)   
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
}
}
	   





