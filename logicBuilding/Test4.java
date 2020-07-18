package logicBuilding;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = s.nextInt();
		System.out.println("Enter second number:");
		int num2 = s.nextInt();
	if((num1+num2)%2 == 0) {
		System.out.println("Sum is even");
	}
	else {
		System.out.println("Sum is odd");
	
	}

	}

}
