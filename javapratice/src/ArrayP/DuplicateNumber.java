package ArrayP;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {12,34,56,33,21,23,12};
				
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println(ar[j]);
				}
			}
		}
	}

}
