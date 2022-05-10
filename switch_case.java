import java.util.Scanner;
public class switch_case
{
public static void main(String[] args )
{
System.out.print("Enter two numbers: \n");
Scanner sc= new Scanner(System.in);
int first = sc.nextInt();
int second = sc.nextInt();
System.out.print("Enter an operator (+, -, *, /): \n");
char operator = sc.next().charAt(0);
int result;
switch(operator)
{
case '+':
result = first + second;
break;
case '-':
result = first - second;
break;
case '*':
result = first * second;
break;
case '/':
result = first / second;
break;
// operator doesn't match any case constant (+, -, *, /)
default:
System.out.printf("Error!operator is not correct");
return;
}
System.out.printf("%.1f %c %.1f =%.1f", first, operator, second, result);
}
}
