/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findmaxele;

/**
 *
 * @author Shubham
 */
import java.util.*;
public class FindMaxEle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Size of Array:");
        int size = sc.nextInt();
        
        int array[] = new int[size];
        
        System.out.println("Enter the Elements of the array:");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        
        int  max = array[0];
        
        for(int i = 0; i < size; i++){
            if(array[i] > max){
            max = array[i];
            }
        }
        System.out.println("The Maximum element in the array is: "+ max);
    }
    
}
