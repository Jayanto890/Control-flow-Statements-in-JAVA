package control_Flow;

import java.util.Scanner;

import java.util.Scanner;

public class IF_ELSE_CONDITION {

	public static void main(String[] args) {
		int pass ;
		System.out.println("Enter the pass");
		Scanner s= new Scanner(System.in);
		
		pass= s.nextInt();
		
		
		if(pass==5555)
		{
			System.out.println(" My Name = Jayanto Biswas");
			System.out.println(" My Roll.no. = 2002900130025");
			System.out.println(" My age = 22");
		}
		else 
		{
			System.out.println("SORRY WRONG PASS....");
	         }
}
}