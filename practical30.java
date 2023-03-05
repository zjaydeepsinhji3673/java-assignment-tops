abstract class Bank
{
	public abstract void getBalance();
}
class bankA extends Bank
{
	int money = 100;
	public void getBalance()
	{
		System.out.println("balance in bank A: $"+money);
	}
}
class bankB extends Bank
{
	int money = 150;
	public void getBalance()
	{
		System.out.println("balance in bank B: $"+money);
	}
}
class bankC extends Bank
{
	int money = 200;
	public void getBalance()
	{
		System.out.println("balance in bank C: $"+money);
	}
}
public class practical30 {
public static void main(String[] args) {
	bankA a = new bankA();
	bankB b = new bankB();
	bankC c = new bankC();
	
	a.getBalance();
	b.getBalance();
	c.getBalance();
}
}
