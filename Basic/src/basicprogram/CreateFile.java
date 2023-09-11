package basicprogram;
import java.io.File;
import java.io.IOException;


public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File obj = new File("C:\\Users\\Durga\\Documents\\Simple\\Simple.txt");
		try { 
		if(obj.createNewFile()) {
			System.out.println("File Created " + obj.getName());
		}
		else {
			System.out.println("File not Created");
		}
		}
      catch(IOException e){
    	  System.out.println("File Error");
    	  e.printStackTrace();
      }
	}
	}

