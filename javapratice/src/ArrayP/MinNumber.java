package ArrayP;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,43,22,33,56};
		
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		
	}

}
