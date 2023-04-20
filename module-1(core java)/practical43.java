class AgeNotWithinRangeException extends Exception
{
	String message = "Age is not between 15 and 21 … Please ReEnter the Age";
	public String toString()
	{
		return message;
	}
}
class NameNotValidException extends Exception
{
	String message = "please enter valid name not include any symbol,number";
	public String toString()
	{
		return message;
	}
}
class student
{
	int rollno;
	String name;
	int age;
	String cource;
	int temp;
	student(int r, String n, int a, String c)
	{
		this.rollno=r;
		this.name=n;
		this.age=a;
		this.cource=c;
		
		try
		{
			if(a>=15 && a<=21)
			{
			throw new AgeNotWithinRangeException();
			}
		}
		catch(AgeNotWithinRangeException e1)
		{
		System.out.println(e1);
		}
		
		int l=name.length();
		for(int i=0;i<l;i++)
		{
		char ch;
		ch=n.charAt(i);
			if(ch<='A' || ch>='Z' && ch<='a' || ch>='z')
			{
				temp = 1;
			}
		}
		try
		{
		if(temp == 1)
		{
			throw new NameNotValidException();
		}
		}
		catch(NameNotValidException e2)
		{
		System.out.println(e2);
		}
	}
}
public class practical43 {
public static void main(String[] args) {
	student s = new student(1,"jaydeep",18,"IT");
	student s1 = new student(2,"jay1234",11,"IT");
}
}
