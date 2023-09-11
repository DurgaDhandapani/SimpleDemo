package basicprogram;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Fname = "Durga D";
		String Lname = "Dhandapani";
		
		String eName = "";
		System.out.println(Fname.concat(Lname));
		
		System.out.println(Fname.contains("Durga"));
		
		System.out.println(Fname.charAt(4));
		
		System.out.println(Fname.equals("Durga "));
		
		System.out.println(Fname.indexOf(9));
		
		System.out.println(eName.isEmpty());
		
		System.out.println(Fname.length());
		
		System.out.println(Fname.replace(" D", "  Dhandapani"));
		
		System.out.println(Fname.replaceFirst("Durga ", "Dhandapani"));

		System.out.println(Fname.replaceAll("D", "Dhandapani"));


		//System.out.println(Fname.split("Durga"));




	}

}
