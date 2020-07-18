package logicBuilding;

import java.util.Scanner;

public class Test11 {
	public int isOdd () {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		if(num%2!=0) {
			return 2;
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Test11 ob = new Test11();	
		System.out.println(ob.isOdd());
						

	}

}
