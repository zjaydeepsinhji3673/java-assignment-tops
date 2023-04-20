import java.util.Scanner;

public class practical15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 1st string:");
	String str1 = sc.next();
	System.out.println("Enter 2nd string:");
	String str2 = sc.next();
	
	String str3 = str1.concat(str2);
	
	System.out.println("String after concatination: "+str3);
}
}
