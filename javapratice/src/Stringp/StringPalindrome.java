package Stringp;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vaibhav";
		
		String rev = "";
		
		for(int i=0;i<s.length();i++) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		if(rev.toLowerCase().equals(s.toLowerCase())) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
