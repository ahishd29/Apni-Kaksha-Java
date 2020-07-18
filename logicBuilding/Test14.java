package logicBuilding;

import java.util.Scanner;

public class Test14 {
	public int addLastDigits(int n1, int n2) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter first number:" );
//		int n1 = s.nextInt();
//		System.out.println("Enter second number:" );
//		int n2 = s.nextInt();
		n1 = Math.abs(n1%10);
		n2 = Math.abs(n2%10);
		 return n1+n2;
	}

	public static void main(String[] args) {
		Test14 ob = new Test14();
		System.out.println(ob.addLastDigits(267,-154));
	}
		
						
						}

	
