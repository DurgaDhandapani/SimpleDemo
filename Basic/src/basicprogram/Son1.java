package basicprogram;

public class Son1 extends Son{
	
	public void business1() {
		System.out.println("Real Estate");
	}

	
	public static void main(String[] args) {
		Son1 obj = new Son1();
		obj.business();
		obj.business1();
	}
}
