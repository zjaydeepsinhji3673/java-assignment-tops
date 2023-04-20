import java.util.ArrayList;

public class practical68 {
public static void main(String[] args) {
	ArrayList<String> c1= new ArrayList<String>(3);
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    System.out.println("before change: "+c1);
    c1.set(1, "white");
    System.out.println("after change: "+c1);
}
}
