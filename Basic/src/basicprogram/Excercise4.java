package basicprogram;
import java.util.Scanner;

public class Excercise4 {

	public static void main(String[] args) {
		char operator;
	    Double number1, number2, result;
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        
        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = obj.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = obj.nextDouble();

        System.out.println("Enter second number");
        number2 = obj.nextDouble();

        
        switch(operator) {
        
        case '+': 
        	
        	result = number1+number2;
        	System.out.println(number1+ "+" + number2 + "=" +result );
        	break;
        case '-': 
        	result = number1-number2;
        	System.out.println(number1+ "-" + number2 + "=" +result );
        	break;
        	
        case '*': 
        	result = number1*number2;
        	System.out.println(number1+ "-" + number2 + "=" +result );
        	break;
        
        case '/': 
        	result = number1/number2;
        	System.out.println(number1+ "-" + number2 + "=" +result );
        	break;
        	
        default:
	    	System.out.println("No Matching Found");        		
        }
	}

}
