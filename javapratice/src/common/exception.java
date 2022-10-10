package common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class exception {

	public static void main(String[] args) {
	String s ="vaibhav automation tester vaibhav";
		
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!= ' ') {
				count++;
			}
		}
		System.out.println(count++);
		
		
		}

}
