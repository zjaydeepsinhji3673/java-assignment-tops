import java.util.HashMap;
import java.util.Map;

public class practical66 {
public static void main(String[] args) {
	Map map = new HashMap();
	map.put(1, "c");
	map.put(2, "c++");
	map.put("java", 3);
	map.put('r', "python");
	map.put(null, 'q');
	
	System.out.println(map.isEmpty());
}
}
