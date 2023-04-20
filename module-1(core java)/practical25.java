class member
{
	int d_member = 1;
	String name = "Jaydeepsinh";
	int age = 21;
	long phoneno = 1234567890;
	String address = "ahmedabad";
	double salary = 20000.00;
	
	public void salary() {
		System.out.println("salary is: "+salary);
	}
}
public class practical25 {
public static void main(String[] args) 
{
	member m = new member();
	m.salary();
}
}
