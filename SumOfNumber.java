import java.lang.*;
import java.util.*;

class SumOfNumber{
	
		public static void main(String args[]){
		
			Scanner sc = new Scanner(System.in);
			int n, sum = 0;
			
			
			System.out.println("Enter the number of elements you want to sum: ");
			n = sc.nextInt();

			for(int i = 0; i <= n; i++){
			 System.out.print("Enter number " + (i + 1) + ": ");
           		 int num = sc.nextInt();
				sum += i;
	
			}
	
		System.out.println("the sum of all the numbers are :" + sum);
		sc.close();
		}
		
	}