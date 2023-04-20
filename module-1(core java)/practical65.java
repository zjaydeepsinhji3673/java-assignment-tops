import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class practical65 {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	hs.add("ram");
	hs.add("sita");
	hs.add("lakshman");
	hs.add("krishana");
	hs.add("radha");
	
	List<String> ls = new ArrayList<String>(hs);
	System.out.println(ls);
}
}
