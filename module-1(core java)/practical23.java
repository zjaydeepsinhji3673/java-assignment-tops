import java.util.Scanner;

public class practical23 {
	public static void area(int l, int b)
	{
		System.out.println("Area of rectangle is: "+l*b);
	}
	public static void area(int a)
	{
		System.out.println("Area of square is: "+a*a);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for area of rectangle of length:");
		int a = sc.nextInt();
		System.out.println("enter value for area of rectangle of breadth:");
		int b = sc.nextInt();
		area(a,b);
		System.out.println("enter value for area of square of side of square:");
		int c = sc.nextInt();
		area(c);
	}
}
