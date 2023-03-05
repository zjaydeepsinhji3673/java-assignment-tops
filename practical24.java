class parent
{
	public void print1()
	{
		System.out.println("this is a parent class method");
	}
}
class child extends parent
{
	public void print()
	{
		System.out.println("this is a child class method");
	}
}
public class practical24 {
	public static void main(String[] args) {
		parent p = new parent();
		child c = new child();
		p.print1();
		c.print();
		c.print1();
		}
}


