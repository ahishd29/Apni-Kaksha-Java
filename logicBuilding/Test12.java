package logicBuilding;
import java.util.Scanner;

public class Test12 {
	public int  lastDigit() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:" );
		int num = s.nextInt();
		int num1 = Math.abs(num%10);
		return num1;
		
		
	}

	

	public static void main(String[] args) {
						Test12 ob = new Test12();
						System.out.println(ob.lastDigit());
						

	}

}
