import java.util.Scanner;

public class average 

{
public static void Main(String[] args)
{
	Scanner sc = new Scanner(System.in); 
	int sum = 0; 
	double avg;
	for (int i=1; i<=10; i++ ) { 
	    System.out.println("Enter number "); 
	    sum = sum + sc.nextInt(); 
	    avg = sum/10; 
	}
	System.out.println("sum is "+ sum); 
	System.out.println("Avg is : "+ avg);
	}

	

}
