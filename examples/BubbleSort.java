package examples;

public class BubbleSort {

	public static void main(String[] args) {
				int a[]= {1,2,3,4,5,6,7,8,9,-2,-90,-200,-1000};
				int n=a.length;
				boolean sorted=true;
				System.out.println("Before sorting:");
				for(int it: a) {
					System.out.print(it+" ");
				}
				
				for(int i=0;i<n-1;i++) {
					for(int j=0;j<n-1-i;j++) {
						if(a[j+1]<a[j]) {
							int temp=a[j+1];
							a[j+1]=a[j];
							a[j]=temp;
							sorted=false;
						}
					}
					if(sorted) {
						System.out.println("Previously sorted");
						break;
					}
				}
				System.out.println("Sorted array elements:");
				for(int item: a) {
					System.out.print(item+" ");
				}

	}

}
