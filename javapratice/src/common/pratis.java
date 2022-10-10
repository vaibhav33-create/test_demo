package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class pratis {

	public static void main(String[] args) {
	
	String str = "vai123bhav";
		
	
		char[] charar = str.toCharArray();
		reversestr(charar);
		String rev = new String(charar);
		
		
		
		System.out.println(rev);
	
		
	
	}

	private static void reversestr(char[] charar) {
		// TODO Auto-generated method stub
		int i=0;
		int j=charar.length-1;
		
		while(i<j) {
			if(!Character.isAlphabetic(charar[i])) {
				i++;
				
			}
			else if 
				(!Character.isAlphabetic(charar[j])){
					j--;
				}
			
			
			else {
				
				char temp = charar[j];
				charar[j] = charar[i];
				charar[i] = temp;
				i++;
				j--;
				
				
			}
			}
	}

}
