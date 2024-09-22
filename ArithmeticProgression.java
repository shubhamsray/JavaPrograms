import java.lang.*;
import java.util.*;

class ArithmeticProgression{

		public static void main(String args[]){
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first term (a) :" );
			int a = sc.nextInt();

			System.out.println("Enter the common difference (d):");
			int d = sc.nextInt();

			System.out.println("Enter the number of terms you want(n):");
			int n = sc.nextInt();

			sc.close();


			System.out.println("The A.P is : ");
			for(int i = 0; i < n; i++){
			
				int term = a + i * d;
				System.out.print(term + " ");
			}
			
		}
	}