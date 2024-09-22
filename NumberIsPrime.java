import java.lang.*;
import java.util.*;

class NumberIsPrime{
		
		public static void main(String args[]){
		
				Scanner sc = new Scanner(System.in);

				System.out.println("Enter the your Number:");
				int num = sc.nextInt();
				
				if(isPrime(num)){
			
					System.out.println("The Number is Prime!! :" + num);
				} else{
			
					System.out.println("the number is not prime");
				
				}
					
			sc.close();
		
			}
	
	public static boolean isPrime(int num){
		
				if(num <= 1){
		
					return false;
					}

				for(int i = 2; i <= Math.sqrt(num); i++){
			
					if(num % i == 0){
		
					   	return false;
		
					}
				}
			
			return true;
		}
	}