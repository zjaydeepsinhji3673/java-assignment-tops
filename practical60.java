import java.util.ArrayList;
import java.util.List;

public class practical60 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("RED");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	System.out.println("before extracing: "+ls);
	List<String> sub = new ls.subList(0, 3);
	System.out.println(sub);
}
}