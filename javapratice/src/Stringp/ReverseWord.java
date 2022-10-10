package Stringp;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vaibhav is tester";
		String[] arr = s.split("\\s");
		String rev = "";

		
		
		for(int i=arr.length-1;i>=0;i--) {
			rev = rev + arr[i] + " ";
		}
		System.out.println(rev);
	}

}
