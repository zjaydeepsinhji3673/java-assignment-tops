 import java.util.Scanner;

public class practical9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string that have mix of character,number and spaces");
	String str = sc.nextLine();
	
	char[] ch = str.toCharArray();
	int letter = 0;
	int space = 0;
	int num = 0;
	int other = 0;
	for(int i = 0; i < str.length(); i++)
	{
		if(Character.isLetter(ch[i]))
		{
			letter ++ ;
		}
		else if(Character.isDigit(ch[i]))
		{
			num ++ ;
		}
		else if(Character.isSpaceChar(ch[i]))
		{
			space ++ ;
		}
		else{
			other ++;
		}
	}
	System.out.println("letter are in the string: " + letter);
	System.out.println("space are in the string: " + space);
	System.out.println("number are in the string: " + num);
	System.out.println("other character are in the string: " + other);
}
}
