import java.util.ArrayList;
import java.util.List;

public class practical61 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("RED");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	
	List<String> ls1 = new ArrayList<String>();
	ls1.add("RED");
	ls1.add("green");
	ls1.add("blue");
	ls1.add("yellow");
	ls1.add("black");
	
	System.out.println(ls.equals(ls1));
}
}
