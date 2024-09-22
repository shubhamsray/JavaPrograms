import java.lang.*;
import java.util.*;


class RotatingArrELe{


		public static void rotateLeftByOne(int[] array){
		
			int firstElement = array[0];
			
			for(int i = 0; i < array.length - 1; i++){
		
				array[i] = array[i + 1];
			}
	
			array[array.length - 1] = firstElement;
		} 
		

		

		public static void printArray(int[] array){
		
			for(int i = 0; i < array.length; i++){
		
					System.out.print(array[i] + " ");
				}
				
				System.out.println();
			}


	
		public static void main(String args[]){

			Scanner sc = new Scanner(System.in);
			
	
			System.out.println("Enter the size of Array:");
			int size = sc.nextInt();

			int array[] = new int[size];

			System.out.println("Enter the Elements of an array:");
			for(int i = 0; i < size; i++){
	
				array[i] = sc.nextInt();
			}

			
			System.out.println("the Orignal Array is:");
			printArray(array);


			rotateLeftByOne(array);


			System.out.println("the Array after Left rotation is:");
			printArray(array);

		sc.close();
	}

}
