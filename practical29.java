abstract class parent12
{
	public abstract void message();
}
class child1 extends parent12
{
	public void message()
	{
		System.out.println("this is first subclass");
	}
}
class child2 extends parent12
{
	public void message()
	{
		System.out.println("this is second subclass");
	}
}
public class practical29 {
public static void main(String[] args) {
	child1 c1 = new child1();
	child2 c2 = new child2();
	
	c1.message();
	c2.message();
}
}
