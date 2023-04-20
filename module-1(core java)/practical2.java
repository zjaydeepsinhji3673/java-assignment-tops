import java.util.Scanner;

public class practical2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter character: ");
		char ch = sc.next().charAt(0);
		String str = String.valueOf(ch);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("enter character "+ ch +" is a vowel.");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Enter character "+ch+" is a consonant.");
		}
		else if((str.length() < 1) || (ch>='0'&&ch<='9'))
		{
			System.out.println("Please enter proper input.");
		}
	}

}
