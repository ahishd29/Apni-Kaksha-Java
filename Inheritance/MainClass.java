package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Anuj";
		t.eat();
		t.walk();
		t.teach();
		
		Singer s = new Singer();
		s.name = "Ram";
		s.sing();
		s.eat();
		

	}

}
