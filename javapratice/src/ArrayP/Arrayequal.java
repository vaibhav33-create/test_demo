package ArrayP;

import java.util.Arrays;

public class Arrayequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {12,21,12,33,45,43,42};
		int[] ar1 = {12,21,12,33,45,43,42};
		
		boolean status = Arrays.equals(ar, ar1);
		
		if(status==true) {
			System.out.println("array are equal");
		}else {
			System.out.println("arrays not equal");
		}
	}

}
