package basicprogram;

public class MethodOverloading {
	
	public void studentName(int empId) {
		System.out.println(empId);
	}

    public void studentName(String name) {
		System.out.println(name);

		
	}

        public void studentName(Double salary) {
    		System.out.println(salary);

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj  = new MethodOverloading();
		obj.studentName("Durga");
		obj.studentName(123);
		obj.studentName(20000);
		int i = 010;
		int j= 07;
		System.out.println(j);

	}

}
