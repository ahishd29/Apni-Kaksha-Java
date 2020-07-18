package logicBuilding;

import java.util.Scanner;

public class Test13 {
	public int  secondLastDigit() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:" );
		int num = s.nextInt();
		
		int num1 = Math.abs(num/10);
		if(num1<1) {
			return -1;
		}
		else {
		int num2 = num1%10;
		return num2;
		}
		
	}

	public static void main(String[] args) {
		Test13 ob = new Test13();
		System.out.println(ob.secondLastDigit());
					

	}

}
