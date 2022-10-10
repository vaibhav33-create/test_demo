package Stringp;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "army";
		String s1 = "mary";
		
		char[] arr = s.toLowerCase().toCharArray();
		char[] arr1 = s1.toLowerCase().toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		if(Arrays.equals(arr, arr1)){
			System.out.println("anagram");
		}else {
			System.out.println("not angram");
		}
	}

}
