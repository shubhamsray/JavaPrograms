import java.lang.*;
import java.util.*;


class CopyArray{

		public static void main(String args[]){

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Size of Array: ");
			int size = sc.nextInt();

			int orignalArr[] = new int[size];


			System.out.println("Enter the Elements of Array: ");
			for(int i = 0; i < size; i++){
	
				orignalArr[i] = sc.nextInt();
			}


		
			int copiedArr[] = new int[size];

			for(int i = 0; i < size; i++){
	
				copiedArr[i] = orignalArr[i];
			}
		
			
			System.out.println("the Elements of Copied Array: ");
			for(int i = 0; i < size; i++){
	
				System.out.print(copiedArr[i] + " ");
			}
		
		sc.close();
	}
}
			