package basicprogram;
import java.io.FileWriter;
import java.io.IOException;


public class WriteAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter obj = new FileWriter("C:\\Users\\Durga\\Documents\\Simple\\Simple.txt");
			obj.write("This is Sample pharses");
			obj.close();
			System.out.println("Successfully writed");
		}
		catch(IOException e){
	    	  System.out.println("File Error");
	    	  e.printStackTrace();
	      }
	}

}
