package basicprogram;

public class Functions {
	
	public int  addNumbers(int a , int b) {
		int add = a+b;
		return add;
	}
	
	public int  subNumbers(int a , int b) {
		int sub = a-b;
		return sub;
	}
	public int  multiplicateNumbers(int a , int b) {
		int mul = a*b;
		return mul;
	}
	public int  divideNumbers(int a , int b) {
		int div = a/b;
		return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 17;
		int num2 = 99;
		
		Functions obj = new Functions();
		
		int resultAdd= obj.addNumbers(num1, num2);
		System.out.println(resultAdd);
		
		int resultSub= obj.subNumbers(num1, num2);
		System.out.println(resultSub);
		
		int resultMul= obj.multiplicateNumbers(num1, num2);
		System.out.println(resultMul);
		
		int resultDiv= obj.divideNumbers(num1, num2);
		System.out.println(resultDiv);

	}

}
