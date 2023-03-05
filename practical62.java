import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practical62 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("RED");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	System.out.println("before swaping: "+ls);
	Collections.swap(ls, 1, 2);
	System.out.println("after swaping: "+ls);
}
}
