import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practical59 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("RED");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	System.out.println("before reversing: "+ls);
	Collections.reverse(ls);
	System.out.println("after reversing: "+ls);
}
}
