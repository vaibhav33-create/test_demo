package ArrayP;

public class Secondlargenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {12,43,21,43,21,56,34};
		
		int max = ar[0];
		int max1 = ar[1];
		int temp;
		int size = ar.length;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			
		}
		System.out.println(ar[size-2]);
		
	}

}
