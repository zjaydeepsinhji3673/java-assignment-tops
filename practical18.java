
public class practical18 {
public static void main(String[] args) {
	String str1 = "Red is favorite color.";
    String str2 = "Orange is also my favorite color.";

    String start_Str = "Red";

    boolean starts1 = str1.startsWith(start_Str);
    boolean starts2 = str2.startsWith(start_Str);

    System.out.println(str1 + " starts with " +start_Str + " ? " + starts1);
    System.out.println(str2 + " starts with " +start_Str + " ? " + starts2);
}
}
