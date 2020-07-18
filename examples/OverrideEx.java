package examples;

public class OverrideEx {
	int x = 10;

	public static void main(String[] args) {
		OverrideEx myObj = new OverrideEx();
		myObj.x = 25; // x is now 25
	    System.out.println(myObj.x);
	}

}
