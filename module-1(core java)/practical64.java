import java.util.HashSet;

public class practical64 {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	hs.add("ram");
	hs.add("sita");
	hs.add("lakshman");
	hs.add("krishana");
	hs.add("radha");
	String[] str = new String[5];
	hs.toArray(str);
	System.out.println("Array elements: ");
    for(String element : str){
      System.out.println(element);
    }
}
}
