class SHape11 {
	public void print() {
		System.out.println("this  is shape.");
	}
}

class RECtangle11 extends SHape11 {
	public void rect() {
		System.out.println("This is rectangular shape");
	}
}

class CIrcle extends SHape11 {
	public void rect() {
		System.out.println("This is circular shapes");
	}
}

class square1 extends RECtangle11 {
	public void squarerect() {
		System.out.println("Square is a rectangle");
	}
}

public class practical35 {
	public static void main(String[] args) {
		square1 s = new square1();
		s.squarerect();
		s.rect();
	}
}
