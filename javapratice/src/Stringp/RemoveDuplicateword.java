package Stringp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="i am am vaibhav";
		
		String[] as = s.split(" ");
		
		Set<String> hset = new LinkedHashSet<String>();
		
		for(String x : as) {
			hset.add(x);
		}
		
		Iterator it = hset.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
