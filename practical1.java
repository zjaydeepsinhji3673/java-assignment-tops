import java.util.Scanner;

public class practical1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("enter value for a");
		a =sc.nextInt();
		
		System.out.println("enter value for b");
		b = sc.nextInt();
		
		System.out.println("enter value for c");
		c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is maximum out of three");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is maximum out of three");
		}
		else
		{
			System.out.println("c is maximum out of three");
		}
	}

}
