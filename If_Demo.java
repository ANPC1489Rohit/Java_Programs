
import java.util.Scanner;
public class If_Demo {

	public static void main(String[] args) {
	
		int num,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		num=sc.nextInt();
		if(num%4==0)
		{
			res=num*num;
			System.out.println("The square is ="+res);
		}

	}

}
