import java.util.HashSet;

public class practical70 {
public static void main(String[] args) {
	HashSet<String> h1 = new HashSet<String>();
         h1.add("Red");
         h1.add("Green");
         h1.add("Black");
         h1.add("White");
         System.out.println("Frist HashSet content: "+h1);
         HashSet<String>h2 = new HashSet<String>();
         h2.add("Red");
         h2.add("Pink");
         h2.add("Black");
         h2.add("Orange");
         System.out.println("Second HashSet content: "+h2);
         h1.retainAll(h2);
         System.out.println("HashSet content:");
         System.out.println(h1);
}
}
