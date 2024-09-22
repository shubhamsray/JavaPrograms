import java.lang.*;
import java.util.*;

class ReverseNum{
		
		public static void main(String args[]){

			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter the Number");
			int num = sc.nextInt();

			int reverseNum = 0;
		
			while(num != 0){
		
				int digit = num % 10;
				reverseNum = reverseNum * 10 + digit;
				num /= 10;
		
			}
	
			System.out.println("Reversed Number :" + reverseNum );
			sc.close();
			}	
	}
				
				
			