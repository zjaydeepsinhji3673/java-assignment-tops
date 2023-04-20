import java.util.Scanner;

public class practical8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter an integer number: ");
	int number = sc.nextInt();
	
	// int len = number.length();   here int is primitive data type so we have to convert into wrapper class.
	String len = String.valueOf(number);
	
	System.out.println("number of digit in entered number is: "+len.length());
}
}
