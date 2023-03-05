import java.util.Scanner;

public class practical41 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter yuor age:");
	int age = sc.nextInt();
	try
	{
		if(age<18)
		{
			throw new ArithmeticException("you are not allowed for vote.");
		}
		else
		{
			System.out.println("you are valid for vote.");
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
