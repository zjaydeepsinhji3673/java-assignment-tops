import java.util.Scanner;

public class practical5 {
public static void main(String[] args) {
	int i=0,sum=0,n=0;
	double avg;
	
	System.out.println("Enter five numbers: ");
	
	for(i=0;i<5;i++)
	{
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 
		 sum = sum + n;
	}
	
	avg = sum / 5;
	
	System.out.println("sum of five number is:"+sum+"    average of five number is:"+avg);
}
}
