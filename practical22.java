
public class practical22 {
	public void print(int n, char c)
	{
		System.out.println("Interger value is:"+n);
		System.out.println("character value is:"+c);
	}
	public void print(char c, int n)
	{
		System.out.println("Interger value is:"+n);
		System.out.println("character value is:"+c);
	}
	public static void main(String[] args) {
		practical22 obj = new practical22();
		obj.print(10,'J');
		obj.print('H', 11);
	}
}
