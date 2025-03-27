package programPackage;

import java.util.Arrays;

public class SortArr {

	public static void main(String[] args) {

		int a[]= {2,4,5,1,10,15};
		int result1[]= {}, result2[] = {};
		java.util.Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++) {
        	boolean value = Method(a[i]);
        	if(value=true) {
        		System.out.println(a[i]);
        		result1[i]=a[i];
        		
        	}
        		else {
        			result2[i]=a[i];
        		}
        
        	}
        for(int j=0;j<3;j++) {
    	System.out.println(result1[j]);
    	System.out.println(result2[j]);
        }
	}
	
	public static boolean Method(int a) {
		int c=a%5;
		if(c==0) {
		//	System.out.println("It is multipe");
			return true;
		}else
		{
		//	System.out.println("It is not multipe");
			return false;
		}
	}

}
