package examples;

public class StringIntroduction {

	public static void main(String[] args) {
		String name = "Ahish"; //stringPool area
		String name2="Ahish";  //stringPool area
		String anotherName=new String("Ahish");  //heap area
		System.out.println(name==anotherName);
		System.out.println(name==name2);
		name="Ahi";
		System.out.print(name);
	
	
	
	}
		

}
