import java.util.Scanner;

public class practical37 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 2 number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	try
	{
		int c = a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("number can't divisible by zero");
	}
	
}
}
