import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practical51 {
	public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("red");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	System.out.println("before sorting: "+ls);
	Collections.sort(ls);
	System.out.println("after sorting: "+ls);
}
}