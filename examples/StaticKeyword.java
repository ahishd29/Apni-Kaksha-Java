package examples;

public class StaticKeyword {
	static {
		System.out.println("in block1");
	}
	static {
		System.out.println("in block2");
	}
	

	public static void main(String[] args) {
		
		System.out.println("inside main");
	}
	static {
		System.out.println("in block3");
	}
}
