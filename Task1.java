package assignment1;

public class Task1 {

	public static void main(String[] args) {
	//	Task 1 – Write a program to swap two number. 
	//  For example a=10 and b=20 output should be a=20 and b=10
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping a and b: "+a+" "+b);
		//System.out.println("Before swapping b:"+b);
		a = a+b;
		b = a-b;
		a = a-b;
	
		System.out.println("After swapping a and b: "+a+" "+b);
		//System.out.println("After swapping b:"+b);
		
	}

}
