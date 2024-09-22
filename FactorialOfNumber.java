import java.lang.*;
import java.util.*;

class FactorialOfNumber{
	
		public static void main(String  args[]){

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the your Number");
			int number = sc.nextInt();
		
			long factorial = 1;

			for(int i = 1; i <= number; i++){
	
				factorial *= i;
	
			}

		System.out.println("the factorial of the given number is :" + factorial);

		sc.close();
	}
}