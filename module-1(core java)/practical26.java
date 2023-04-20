
class Rectangle
{
	int length;
	int breadth;
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public void area()
	{
		System.out.println("area of rectangle: "+length*breadth);
	}
	public void perimeter()
	{
		System.out.println("perimeter of rectangle: "+2*(length+breadth));
	}
}
class Square extends Rectangle
{
	int s;
	public Square(int s)
	{
		super(s,s);
		this.s = s;
		
	}
	public void areas() {
		super.area();
		System.out.println("area of square: "+s*s);
	}
	public void perimeters()
	{
		super.perimeter();
		System.out.println("perimeter of square: "+4*s);
	}
}
public class practical26 {
public static void main(String[] args) {
	Square s = new Square(5);
	s.areas();
	s.perimeters();
}
}

