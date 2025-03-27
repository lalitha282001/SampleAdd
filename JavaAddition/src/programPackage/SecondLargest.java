package programPackage;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int first=a[0], second=a[0];
		for(int i=1;i<7;i++) {
			if(a[i]>first) {
				second=first;
				first=a[i];
			}
			else if(a[i]>second) {
				second=a[i];
				System.out.println("else");
			
			}
		}
		System.out.println(second);
	}

}
