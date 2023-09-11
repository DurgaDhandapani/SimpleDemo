package basicprogram;

import java.util.Scanner;

public class SimpleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		String Name = obj.nextLine();
		int Age = obj.nextInt();
		
		
		
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		
		System.out.println("Name is "+ Name);
		System.out.println("Age is "+ Age);
		System.out.println("Adding two numbers "+ (num1+num2));
		System.out.println("Subtracting two numbers "+ (num1-num2));




	}

}
