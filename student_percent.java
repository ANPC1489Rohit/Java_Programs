package java_program;
import java.util.Scanner;
public class student_percent
{

	public static void main(String[] args)
	{

		    int n,i;
			String student_name;
			int roll_no;
		double phone_no;
			double marks;
			float percetage_grade;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student name:");
			student_name=sc.nextLine();
			
			System.out.println("Enter your roll number:");
			roll_no=sc.nextInt();
			
			System.out.println("Enter your phone number:");
			phone_no=sc.nextDouble();
			

			System.out.println("Enter total subject:");
			n=sc.nextInt();
		
			//declare the array
			int arr[]=new int[n];

		   System.out.println("Enter the marks score in each subject:");
					
		   for(i=0;i<n;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
	       
		   int total=0;
		
		   for(i=0;i<n;i++)
		   {
			   total=total+arr[i];
		   }
            System.out.println("Total marks obtain in:"+total);
            
            
            float percentage; 
            percentage = (total / (float)n); 
            
            //Display the total percentage
            System.out.println( "Total Percentage : " + percentage + "%");   
            
            
            if(percentage>60)
    		{
    			System.out.println("P");
    		}
    		else
    		{
    			System.out.println("F");
    		}
        }   
	
	
}
