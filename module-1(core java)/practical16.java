import java.util.Scanner;

public class practical16 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 1st string:");
	String str1 = sc.next();
	System.out.println("Enter 2nd string:");
	String str2 = sc.next();
	
	System.out.println("Comparing "+str1+" And "+str2+" :"+str1.contentEquals(str2));
}
}
