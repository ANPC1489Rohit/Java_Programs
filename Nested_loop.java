import java.util.Scanner;

 class Nested_loop {
	public static void main(String[] args) 
	{
int i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your number: ");
i=sc.nextInt();

for(i=1;i<=10;++i)
{
	System.out.printf("%d * %d = %d \n", i, i, i * i);
}
}
}
