import java.util.HashSet;
import java.util.Iterator;

public class practical55 {
public static void main(String[] args) {
	
	HashSet<String> hs = new HashSet<String>();
	hs.add("ram");
	hs.add("sita");
	hs.add("lakshman");
	hs.add("krishana");
	hs.add("radha");
	
	Iterator itr = hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}