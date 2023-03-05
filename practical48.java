import java.util.ArrayList;
import java.util.List;

public class practical48 {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("RED");
		ls.add("green");
		ls.add("blue");
		ls.add("yellow");
		ls.add("black");
		System.out.println(ls);
		ls.set(3,"white");
		System.out.println("after updating array list");
		System.out.println(ls);
}
}