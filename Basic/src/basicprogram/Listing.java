package basicprogram;
import java.util.HashMap;

public class Listing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> car = new HashMap<String, Integer>();
		
		car.put("Honda",2016);
		car.put("Hyndai", 2017);
		car.put("Macada", 2019);
        car.remove("Honda");
		
		System.out.println(car);
		
		

	}

}
