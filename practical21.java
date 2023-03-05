
public class practical21 {
	public void printn(int number)
	{
		System.out.println("integer number is:"+number);
	}
	public void printn(float number)
	{
		System.out.println("float number is:"+number);
	}
	public void printn(long number)
	{
		System.out.println("long number is:"+number);
	}
	public void printn(double number)
	{
		System.out.println("double number is:"+number);
	}
	public static void main(String[] args) {
		practical21 obj = new practical21();
		obj.printn(10);
		obj.printn(10.10);
		obj.printn(1234567890);
		obj.printn(10.1010101010101);
	}
}
