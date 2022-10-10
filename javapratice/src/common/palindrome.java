package common;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "madam sir vaibhav";
	char[] ch = s.toCharArray();
	
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(ch[i]==ch[j]) {
				System.out.println(ch[i]);
			}
		}
	}
		
	}

}
