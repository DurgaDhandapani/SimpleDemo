package basicprogram;

import java.util.LinkedList;
import java.util.Scanner;


public class SimpleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Arithmetic exception
		 * int n= 10;
		 * 
		 * System.out.println(n/0);
		 */
		
		/* null pointer exception
		 * String n = null; System.out.println(n.length());
		 */
		//Input Mismatch exception
		/*
		 * Scanner s = new Scanner(System.in);
		 * 
		 * System.out.println(s.nextInt());
		 */
		// Array Indexoutbound exception
		/*
		 * int[] num = {1,2,3,4};
		 * 
		 * System.out.println(num[7]);
		 */
		//String Index out bound exception
		/*
		 * String S = "Java"; char c = S.charAt(7);
		 * 
		 * System.out.println(c);
		 */
		//Index outofBound exception
		
		/*
		 * LinkedList<String> S = new LinkedList<String>(); S.add("1234");
		 * System.out.println(S.get(2));
		 */
		try {
			System.out.println(10/2);
		}
		catch(ArithmeticException  e) {
			System.out.println("Dont throw error");
		} 
	}
	
	

}
