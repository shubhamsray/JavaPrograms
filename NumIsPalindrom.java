import java.lang.*;
import java.util.*;

class NumIsPalindrom{

		public static void main(String args[]){
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the your Number");
			int num = sc.nextInt();
	
			int rem = 0;
			int original = num;
	
			while( num != 0 ){
		
				int digit = num % 10;
				rem = rem * 10 + digit;
				num /= 10;
		
			}
		
			if(rem == original){
					System.out.println( rem +" the number is Palindrome ");
				}else{
					System.out.println( rem +" the number is not Palindrome" );
				}
	
		sc.close();
	}
}