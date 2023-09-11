package basicprogram;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File obj = new File("C:\\Users\\Durga\\Documents\\Simple\\Simple.txt");
			Scanner reader = new Scanner(obj);
			
			while(reader.hasNextLine()) {
				String Data = reader.nextLine();
				System.out.println("Successfully Read " + Data);
			}
		}
		catch(FileNotFoundException e){
	    	  System.out.println("File not Found");
	    	  e.printStackTrace();
			
		}

	}

}
