
public class practical36 {
public static void main(String[] args) {
	try {
		int number = 20/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
}
