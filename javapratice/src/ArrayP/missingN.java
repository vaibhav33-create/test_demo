package ArrayP;

public class missingN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,4,5};
		int sum1 =0;
		
		for(int i=0;i<ar.length;i++) {
			sum1 = sum1+ar[i];
		}
		System.out.println(sum1);
		
		int sum = 0;
		
		for(int i=0;i<=5;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		System.out.println(sum-sum1);
	}

}
