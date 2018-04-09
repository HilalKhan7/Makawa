package LabWork;
import java.util.Scanner;


public class Assertion {

	public static void main(String[] args) 
	{
	
         Scanner s=new Scanner(System.in);
         
         System.out.println("Enter your Weight");
         
         int weight=s.nextInt();
         
		assert weight>=100:"YALAKA Kama Khwra";
		
		System.out.println("weight = "+weight);
        
        

	}

}
