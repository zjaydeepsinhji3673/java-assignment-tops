abstract class shape
{
	public abstract void RectangleArea(int l,int b);
	public abstract void SquareArea(int s);
	public abstract void CircleArea(int r);
}
class area extends shape
{
	double pi = 3.14;
	public void RectangleArea(int l,int b) {
		System.out.println("area of rectangle: "+l*b);
	}
	public void SquareArea(int s) {
		System.out.println("area of square: "+s*s);
	}
	public void CircleArea(int r) {
		System.out.println("area of circle: "+pi*r*r);
	}

}
public class practical33 {
public static void main(String[] args) {
	area a = new area();
	a.RectangleArea(5,6);
	a.SquareArea(5);
	a.CircleArea(5);
}
}
