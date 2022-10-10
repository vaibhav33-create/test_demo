package Stringp;

public class totalcntchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vaibhav tester vaibhav tester vaibhav tester vaibhav tester";
		int cnt = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
