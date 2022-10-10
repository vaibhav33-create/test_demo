package common;

 class abc{

private int no;	 
	
void setter(int n) {
	this.no = n;
}
int getter() {

	return no;
}
}

public class aug24 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abc ab = new abc();
		
		ab.setter(45);
		System.out.println(ab.getter());
	
		
		
	}

}
