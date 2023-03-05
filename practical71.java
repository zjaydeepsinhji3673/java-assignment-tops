import java.util.HashMap;
import java.util.Map;

public class practical71 {
public static void main(String[] args) {
	Map map = new HashMap();
	map.put(1, "c");
	map.put(2, "c++");
	map.put("java", 3);
	map.put('r', "python");
	map.put(null, 'q');
	
	System.out.println("values in hashmap: "+map.values());
	System.out.println("keys in hashmap: "+map.keySet());
}
}
