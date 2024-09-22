import java.lang.*;
import java.util.*;

class HashMap1 {
	
		public static void main(String args[]){
	
			HashMap<String, Integer> map = new HashMap<>();

			
			map.put("Alice", 25);	
			map.put("Shubham", 25);
			map.put("Vibhor", 28);
			map.put("Ajit", 50);
			map.put("Rashmi", 36);	

			System.out.println("Initial HashMap: ");

			for(Map.Entry<String, Integer> entry : map.entrySet()) {

				System.out.println(entry.getKey() + "is " + entry.getValue() + "years old.");
			
			}



			String searchKey = "Shubham";
			
			if(map.containsKey(searchKey)){

				System.out.println("\n" + searchKey + "is found in the map with the age: " + map.get(searchKey));

			}
		


			map.remove("Rashmi");

			
			 System.out.println("\nAfter removing Rashmi, does the map contain 'Rashmi'? " + map.containsKey("Rashmi"));

       

      			  System.out.println("\nUpdated HashMap:");

       			 for (Map.Entry<String, Integer> entry : map.entrySet()) {

           			 System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");

        		}
		}
	}
			