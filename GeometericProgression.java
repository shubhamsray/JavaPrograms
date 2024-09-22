import java.lang.*;
import java.util.*;

class GeometericProgression{
			
		public static void main(String args[]){
	
			Scanner sc = new Scanner(System.in);
			
			 System.out.print("Enter the first term (a): ");
      			  double firstTerm = sc.nextDouble();

     			 System.out.print("Enter the common ratio (r): ");
       			 double commonRatio = sc.nextDouble();

        		System.out.print("Enter the number of terms (n): ");
       			 int numberOfTerms = sc.nextInt();
			
			 System.out.println("Geometric Progression:");
			for(int i = 0; i < numberOfTerms; i++){

				double term = firstTerm * Math.pow(commonRatio, i);
				 System.out.println( term +" ");
			}
			sc.close();
		}
	}