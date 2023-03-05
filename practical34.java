import java.util.Scanner;

public class practical34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks:");
		int marks = sc.nextInt();
		
		if(marks>=91 && marks<=100)
		{
			System.out.println("your grade is AA");
		}
		else if(marks>=81 && marks<=90)
		{
			System.out.println("your grade is AB");
		}
		else if(marks>=71 && marks<=80)
		{
			System.out.println("your grade is BB");
		}
		else if(marks>=61 && marks<=70)
		{
			System.out.println("your grade is BC");
		}
		else if(marks>=51 && marks<=60)
		{
			System.out.println("your grade is CD");
		}
		else if(marks>=41 && marks<=50)
		{
			System.out.println("your grade is DD");
		}
		else if(marks<=40)
		{
			System.out.println("you are fail...");
		}
		else
		{
			System.out.println("enter proper value");
		}
	}
}
