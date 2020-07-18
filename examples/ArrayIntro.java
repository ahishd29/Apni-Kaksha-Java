package examples;
import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr ;
		arr = new int[10];
		System.out.println("Enter the array elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		sc.nextLine();
		System.out.println("The array elements are:");
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.println(arr[i]);
		}
		

	}

}
