package basicprogram;
import java.util.Scanner;

public class Excerise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner value = new Scanner(System.in);
		
		int i,j,k,c1,c2,r1,r2;
		
		int first[][] = new int[2][2];
        int second[][] = new int[2][2];
        int result[][] = new int[2][2];

        System.out.println("Enter Rows and Cols of First Matrix");
        r1 = value.nextInt();
        c1 = value.nextInt();
 
        System.out.println("Enter Elements of First Matrix");
 
        // Input first matrix from user
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                first[i][j] = value.nextInt();
            }
        }
 
        System.out.println("Enter Rows and Cols of Second Matrix");
        r2 = value.nextInt();
        c2 = value.nextInt();
 
        System.out.println("Enter Elements of Second Matrix");
 
        // Input second matrix from user
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                second[i][j] = value.nextInt();
            }
        }
 
        // Multiplying two matrices
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                for (k = 0; k < c2; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
 
        // Printing Product Matrix
        System.out.println("Product Matrix");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
