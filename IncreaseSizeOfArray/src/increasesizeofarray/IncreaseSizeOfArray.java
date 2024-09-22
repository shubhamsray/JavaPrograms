/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package increasesizeofarray;

/**
 *
 * @author Shubham
 */
import java.util.*;

public class IncreaseSizeOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int OrignalArr[] = {1, 2, 3};
           System.out.println("Original Array:" + Arrays.toString(OrignalArr));
           
           int newSize = 5;
           int newArray[] = new int[newSize];
           
           for(int i = 0; i < OrignalArr.length; i++){
               newArray[i] = OrignalArr[i];
           }
           newArray[3] = 4;
           newArray[4] = 5;
           
           System.out.println("the new Array is:" + Arrays.toString(newArray));
    }
    
}
