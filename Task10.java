package assignment1;

public class Task10 {

	public static void main(String[] args) {
		//Task 10- Write a program which will break the current execution if it find “Selenium”
		//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
		
	//	String[] str = {“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”};
		//String[] str = {“Java”, ”JavaScript”, ”Selenium”, ”Python”, ”Mukesh”};
		String[] str = {"Java", "JavaScript", "Selenium", "python", "Mukesh"};
		  
		
		for (int i=0; i<str.length; i++)  
		{  
		if(str[i]=="Selenium") {
			break;
		}
		System.out.println(str[i]);
		}  
		
	}

}
