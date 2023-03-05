import java.util.ArrayList;
import java.util.List;

public class practical50 {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>();
	ls.add("RED");
	ls.add("green");
	ls.add("blue");
	ls.add("yellow");
	ls.add("black");
	if(ls.contains("RED"))
	{
		System.out.println("element is found.");
	}
	else
	{
		System.out.println("element is not found.");
	}
}
}
