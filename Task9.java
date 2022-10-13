package assignment1;

public class Task9 {

	public static void main(String[] args) {
		//Task 9- Write a program which will break the current execution if it find number 85
		//Input – [12,34,66,85,900]
		
		int[] no = {12,34,66,85,900};
		
		for(int i=0;i<no.length;i++) {
			if(no[i]==85) {
			break;
			}
			System.out.println(no[i]);
		}


	}

}
