import java.util.Scanner;
class MinimumBalanceException extends Exception
{
	String message="your account balance is not sufficient to withdraw";

    public void MinimumBalanceException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
public class practical42 {
public static void main(String[] args) {
	
	double current_amount = 2000;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter amonut to withdraw: ");
	int w_amount = sc.nextInt();
	
	try
	{
		if(current_amount < w_amount)
		{
			throw new MinimumBalanceException();
		}
		else
		{
			System.out.println("Take your amonut");
		}
	}
	catch(MinimumBalanceException e)
	{
		System.out.println(e);
	}
}
}