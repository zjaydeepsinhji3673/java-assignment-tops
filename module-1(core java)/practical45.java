import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class practical45 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("RED");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	Iterator itr = ls.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
