package basicprogram;

public class ConstClas {
	
	public ConstClas() {
		System.out.println("calling 1st constructor");
	}
	public ConstClas(int a) {
		System.out.println(10);
	}
	private void ConstClas(int a) {
		System.out.println(a);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstClas a = new ConstClas();
		ConstClas a1 = new ConstClas(10);
		a.ConstClas(11);
	}

}
