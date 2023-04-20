import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practical53 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("RED");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	System.out.println(ls);
	Collections.shuffle(ls);
	System.out.println("after shuffling: "+ls);
}
}
