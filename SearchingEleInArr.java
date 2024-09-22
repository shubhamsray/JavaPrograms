/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchingeleinarr;

/**
 *
 * @author Shubham
 */
import java.util.Scanner;

public class SearchingEleInArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Initialize the array
        int[] array = new int[size];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Ask for the element to search
        System.out.print("Enter the element you want to search for: ");
        int searchElement = scanner.nextInt();
        
        // Perform the search
        boolean found = false;
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                position = i;
                break;
            }
        }
        
        // Output the result
        if (found) {
            System.out.println("Element " + searchElement + " found at index " + position);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
        
        scanner.close();
    }
}
