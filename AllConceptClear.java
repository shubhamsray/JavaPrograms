import java.lang.*;
import java.util.*;


interface AnimalActions {

		void makeSound();
		void move();

	}


abstract class Animal {

		String name; 
		
		public Animal(String name){
	
			this.name = name;
		}

		abstract void eat();



		public void sleep() {
	
			System.out.println( name + "is Sleeping!!");
		}

		
		public void sleep(int hours) {
	
			System.out.println( name + " Slept for " + hours + " hours!!!");
		}
		
		
	}



class Dog extends Animal implements AnimalActions {
	
			public Dog (String name) {
	
				super(name);
			}

			
			
			public void eat() {
			
				System.out.println(name + " is eating dog food.");
			}

			
			public void makeSound() {
		
				System.out.println(name + " says Woof Woof.");
			}

			
			public void move() {
		
				System.out.println(name + " is running");
			}

		
			
			public void sleep() {
		
				System.out.println(name + " is Sleeping soundly ");
			}
	
		}
	
	




class Cat extends Animal implements AnimalActions {
	
			public Cat (String name) {
	
				super(name);
			}

			
			
			public void eat() {
			
				System.out.println(name + " is eating cat food.");
			}

			
			public void makeSound() {
		
				System.out.println(name + " says meow meow.");
			}

			
			public void move() {
		
				System.out.println(name + " is jumping ");
			}

	
		}



class AllConceptClear {
	
			public static void main(String args[]){
		
			Dog dog = new Dog("Buddy");

			dog.eat();
			dog.makeSound();
			dog.move();
			dog.sleep();
			dog.sleep(5);
		

			

			Cat cat = new Cat("Whisher");
			
			cat.eat();
			cat.makeSound();
			cat.move();



			try{
			
				int result = 10/0;
			} catch(ArithmeticException e){
		
				System.out.println(" Caught an exception " + e.getMessage());
			}

	}
}	