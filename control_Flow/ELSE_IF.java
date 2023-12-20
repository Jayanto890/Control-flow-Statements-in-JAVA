package control_Flow;

import java.util.Scanner;

public class ELSE_IF {

	public static void main(String[] args) {
		int Marks;
		System.out.println("Enter Marks");
		Scanner s= new Scanner(System.in);
		
	 Marks = s.nextInt();
		if(Marks>=60 && Marks<=100) {
			System.out.println("First Division");
		}
		else if(Marks>=45 && Marks<=60) 
		{
			System.out.println("second Division");
		}
		else if(Marks>=33 && Marks<=45) {
			System.out.println("Third division");
		}
		else {
			System.out.println("fail");
		}
	}
}

