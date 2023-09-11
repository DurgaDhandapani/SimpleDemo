package basicprogram;

public class BasicEmp {
	
	
	public void empName() {
		System.out.println("Raj");
	}
	
	public void empAge() {
		System.out.println(27);
		
	}
	public void empQual() {
		System.out.println("Data Analyst");
	}
	
	
	public static void main(String[]args) {
		
		BasicEmp obj = new BasicEmp();
		obj.empName();
		obj.empAge();
		obj.empQual();
		
	}

}
