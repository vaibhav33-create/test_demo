package Stringp;

public class ReverseEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java program";
		String[] word = s.split("\\s");
		String rev = "";
		// for(String words:word)
		for(int i=0;i<word.length;i++) {
			String words = word[i];
			String revword = ""; 
			System.out.println(words);
			for(int j=words.length()-1;j>=0;j--) {
				revword = revword + words.charAt(j);
			}
			rev= rev + revword + " ";
		}
		System.out.println(rev);
	}

}
