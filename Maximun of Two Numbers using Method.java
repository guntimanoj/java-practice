import java.util.Scanner;
public class MaximumUsingMethod
{
static int findMax(int a, int b)
{
if (a > b)
return a;
else
return b;
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter first number: ");
int num1 = sc.nextInt();

System.out.println("Enter second number: ");
int num2 = sc.nextInt();

int max = findMax(num1, num2);

System.out.println("Maximum = " + max);

sc.close();
}
}
