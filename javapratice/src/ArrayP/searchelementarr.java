package ArrayP;

public class searchelementarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {12,32,12,34,54,32};
		
		int search = 33;
		boolean flag = false;
		
		for(int i=0;i<ar.length;i++) {
			if(search==ar[i]) {
				System.out.println("element fount at "+i);
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("element not found");
		}
	}

}
