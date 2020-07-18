package polymorphism;

public class OverLoading {

	public static void main(String[] args) {
		greetings("HELLO");



	}
	public static void greetings() {
		System.out.println("Hey");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}

}
