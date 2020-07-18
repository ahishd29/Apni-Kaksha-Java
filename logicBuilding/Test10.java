package logicBuilding;
import java.util.Scanner;

public class Test10 {
	public int isEven () {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		if(num%2==0) {
			return 2;
		}
		else {
			return 1;
		}
	}
		

	public static void main(String[] args) {
		Test10 ob = new Test10();	
//		System.out.println(ob.isEven(-1));
		System.out.println(ob.isEven());
					
						
						
					}

	}


