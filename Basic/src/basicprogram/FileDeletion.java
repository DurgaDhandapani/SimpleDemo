package basicprogram;
import java.io.File;

public class FileDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File obj = new File("C:\\Users\\Durga\\Documents\\Simple\\Simple.txt");
         
		if(obj.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("File not deleted ");
		}
	}

}
