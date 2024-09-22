import java.lang.*;
import java.util.*;

class FibonnaciSeries{
	
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the value :");
			int n = sc.nextInt();
			int first = 0; 
			int second = 1;
			
			 System.out.println("Fibonacci Series up to " + n + " terms:");

			for(int i = 0; i < n; i++){

				System.out.print( first + " " );
				int  nextTerm = first + second;
				first = second;
				second = nextTerm;
			}
		
		}
	
	}