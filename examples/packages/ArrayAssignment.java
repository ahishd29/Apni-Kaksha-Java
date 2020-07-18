package examples.packages;
import java.util.Scanner;
public class ArrayAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  no. of Students:");
		int n = sc.nextInt();
		sc.nextLine();
		int[] marks = new int[n];
		System.out.println("Enter the marks of each student:");
		for(int i=0; i<n; i++) {
			marks[i] = sc.nextInt();
		}
			sc.nextLine();
			int sum = 0;
			for(int i=0; i<marks.length; i++) {
				sum+= marks[i];
			}
			double avg=sum/n;
			System.out.println("The average marks of "+ n +" students is " + avg);

	}

}
