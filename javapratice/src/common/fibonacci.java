package common;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c=0;
		
		for(int i=0;i<12;i++) {
			System.out.println(c);
			c= a+b;
			a=b;
			b=c;
		}
		
	}

}
