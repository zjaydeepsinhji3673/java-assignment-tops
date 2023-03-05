import java.util.Scanner;

public class practical32 {
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		 public static void main(String args[]){  
		  int i,fact; 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter number to find Factorial:");
		  int number = sc.nextInt();
		  
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}
