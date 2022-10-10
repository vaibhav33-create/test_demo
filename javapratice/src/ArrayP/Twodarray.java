package ArrayP;

import java.util.Scanner;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no. of rows");
		int rows = sc.nextInt();
		
		System.out.println("enter no. of column");
		int column = sc.nextInt();
		
		
		int[][] data = new int[rows][column];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				data[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
