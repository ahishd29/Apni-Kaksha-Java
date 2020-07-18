package examples.packages.models;

public class Pair<X, Y> {
	X x;
	Y y;
	
	public Pair(X x, Y y) {
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair("Ahi", 003);
		Pair<Boolean, Integer> p2 = new Pair(true, 005);
		p1.getDesc();
		p2.getDesc();
	}
	public void getDesc() {
		System.out.println(x+ " & "+y);
	}

}
