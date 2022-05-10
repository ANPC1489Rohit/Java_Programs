import java.util.Scanner;

public class If_else {
	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		num=sc.nextInt();
		if(num %5==0)
		{
			System.out.println("Number is Even");
			
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}

}
