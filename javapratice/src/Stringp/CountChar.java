package Stringp;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Vaib_hav.@bansude";
		
		String sw = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sw);
		String sd = sw.substring(0, 7) + " " +sw.substring(7, 14);
		System.out.println(sd);
		int result = s.length() - s.replaceAll("a", "").length();
		System.out.println(result);
	}

}
