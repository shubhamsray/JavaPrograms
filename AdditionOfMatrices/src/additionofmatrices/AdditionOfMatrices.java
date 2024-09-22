/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package additionofmatrices;

/**
 *
 * @author Shubham
 */
import java.util.*;
public class AdditionOfMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Rows:");
        int row = sc.nextInt();
        
        System.out.println("Enter the number of Columns:");
        int col = sc.nextInt();
        
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] result = new int[row][col];
        
        System.out.println("Enter the elements of First Matrices");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("Element [" + i + "][" + j + "]: ");
                mat1[i][j] = sc.nextInt();
            }
        }
        
           System.out.println("Enter the elements of Second Matrices");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("Element [" + i + "][" + j + "]: ");
                mat2[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
               result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
         System.out.println("Result of matrix addition:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                  System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
