package control_Flow;

import java.util.Scanner;

public class nested_if_else {

	public static void main(String[] args) {
		int num1,num2,num3;
		System.out.println("Enter any three number");
        Scanner s = new Scanner(System.in);
        
        
        num1= s.nextInt();
        num2= s.nextInt();
        num3= s.nextInt();
        
        if(num1>num2){
        	
         if(num1>num3)
        {
        	System.out.println("Maximum number is :"+num1);
        }
        else {
        	System.out.println("Maximum number is :"+num3);
             }
        }
        
        if(num2>num1) {
        	if(num2>num3)
        	{
        		System.out.println("Maximum number is :"+num2);
        	}
        	else {
        		System.out.println("Maximum number is :"+num3);
        	}
            }
            }
	      


	
	
}

