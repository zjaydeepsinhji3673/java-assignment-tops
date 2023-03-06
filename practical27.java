class triangle
{
	int a,b,c;
	triangle() {
	}
	public double area()
	{
		double p=(a+b+c)/2.0;

		return Math.sqrt(p*(p-a)*(p-b)*(p-c));

	}
	public double perimeter()
	{
		return (a+b+c)/2.0;
	}
}
public class practical27 {
public static void main(String[] args) {
	
	triangle t = new triangle();
	t.a=3;
	t.b=4;
	t.b=5;
	
	System.out.println("area of triangle: "+t.area());
	System.out.println("perimeter of triangle: "+t.perimeter());
}
}
