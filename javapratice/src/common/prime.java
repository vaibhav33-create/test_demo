package common;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		boolean flag = false;
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
