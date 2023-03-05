import java.util.ArrayList;

public class practical69 {
public static void main(String[] args) {
	ArrayList<String> c1= new ArrayList<String>();
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    int s = c1.size();
    for(int i=0;i<=s;i++)
    {
    	System.out.println(c1.get(i));
    }
}
}
