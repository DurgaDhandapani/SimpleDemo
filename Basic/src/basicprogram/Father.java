package basicprogram;

public class Father extends Son  {
	
	public void propertyDetails() {
		System.out.println("House");
	}
	
	public void propertyDetails1() {
		System.out.println("Land");
		
	}
	
	public void propertyValue() {
		System.out.println(200000);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father obj = new Father();
		obj.propertyDetails();
		obj.propertyDetails1();
		obj.propertyValue();
		
		obj.business();

	}

}
