package common;

public class pratiss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s = "vai123bhav";
		
		String[] words = s.split(" ");
		
		
		
		
		boolean set = false; 
	    String reverseString = "";

	    for (int i = 0; i < words.length; i++) 
	    {
	        String word = words[i];

	        String reverseWord = "";

	        for (int j = word.length()-1; j >= 0; j--) 
	        {  
	            if (Character.isAlphabetic(word.charAt(j))){
	                
	            reverseWord = reverseWord + word.charAt(j);
	            set = false; 
	        }else{
	            set = true ; 
	            break ; 
	        }
	        }
	        if(set == true){
	            reverseString = reverseString + reverseWord + word +  " "; 
	        }
	        
	      
	      
	    }
		System.out.println(reverseString);
	}

}
