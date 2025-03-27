package programPackage;

import java.util.Arrays;

public class SecondLargestNumber{
	
public static void main(String []args){
int arr[]={2,4,6,9,8,7};
int box1=arr[0], box2=arr[0];
java.util.Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
for(int i=1;i<5;i++) {
	if(arr[i]>arr[i+1]) {
	box1 = arr[i];
	}
	else {
		box2 = arr[i];
	}
	System.out.println(box2);

}
}
}