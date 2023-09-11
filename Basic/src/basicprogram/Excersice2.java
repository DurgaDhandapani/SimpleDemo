package basicprogram;
import java.util.Scanner;

public class Excersice2 {

	public static void main(String[] args) {
		 int  i;

		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		 int C = S.nextInt();
		 boolean j= false;
		 for(i=2; i<=C/2;++i) {
			 if(C%i==0) {
				 j=true;
				 break;
			 }
			 
		 }
		 if(!j) {
			 System.out.println("is a prime");
			 
		 }
		 else {
			 System.out.println("is not a prime");
		 }
	}

}
