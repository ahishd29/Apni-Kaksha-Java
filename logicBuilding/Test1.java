package logicBuilding;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		if (num==0) {
			System.out.println("The number " + num + "is zero");	
		}
		else if (num>0) {
			System.out.println("The number " + num + "is positive");	
		}
		else {
				System.out.println("The number " + num + " is negative");	
			}
		}
		

	}


