import java.util.ArrayList;
import java.util.List;

public class practical49 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("RED");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	System.out.println(ls);
	ls.remove(2);
	System.out.println("after deleting");
	System.out.println(ls);
}
}
