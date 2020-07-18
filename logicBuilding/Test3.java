package logicBuilding;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		if (num % 2== 0) {
			System.out.println("The number " + num + " is even");	
		}
		else  {
			System.out.println("The number " + num + " is odd");	
		}


	}

}
