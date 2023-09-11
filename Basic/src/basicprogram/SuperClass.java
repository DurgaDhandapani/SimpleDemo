package basicprogram;

public  class SuperClass extends SimpleJavaBasic{
	
	
	public  void saving() {
		System.out.println("current");
		
	}

	public  void balance(Double a) {
		System.out.println("balance : "+a);
		
	}
	public  void amount(Double b ) {
		System.out.println("amount :" +b );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 SuperClass obj = new SuperClass();
	 obj.saving();
	 obj.balance(456899.247);
	 obj.amount(62557.76);
	}

}
