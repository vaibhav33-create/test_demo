package common;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "vaibhav";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
