abstract class Marks
{
	public abstract void getPercentage();
}
class A extends Marks
{
	int s1,s2,s3;
	float per;
	A(int s1,int s2, int s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public void getPercentage()
	{
		per = (s1+s2+s3)*100 / 300;
		System.out.println("percentage of student1 is: "+per);
	}
}
class B extends Marks
{
	int s1,s2,s3,s4;
	float per;
	B(int s1,int s2, int s3,int s4)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}
	public void getPercentage()
	{
		per = (s1+s2+s3+s4)*100 / 400;
		System.out.println("percentage of student1 is: "+per);
	}
}
public class practical31 {
	public static void main(String[] args) {
		A a = new A(60,70,80);
		a.getPercentage();
		B b = new B(60,70,80,90);
		b.getPercentage();
	}
}
