import java.lang.*;
import java.util.*;

class ArmsstrongNumber{
	
		public static void main(String args[]){
	
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Number");
			int n = sc.nextInt();
	
			int orignal = n;
			int digits = 0;
			
			while(orignal != 0){
				digits++;
				orignal /= 10;
			}
		
			orignal = n;
			int result = 0;
	
			for(; orignal != 0; orignal /= 10){
			int digit = orignal % 10;
			result += Math.pow(digit, digits);
			}

			if(result == n){
				System.out.println(n +" the given number is Arms Strong Number");
			}else{
				System.out.println(n +" the given number is not ArmsStrong Number");
			}

		sc.close();
	}
}
				