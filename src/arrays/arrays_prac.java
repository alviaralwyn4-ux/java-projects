/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author alviar
 */
public class arrays_prac {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
       
        String cars [] = new String[5];
         
         for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter Cars " + (i+1) + ": ");
            cars[i] = sc.nextLine();
        }  
        
         System.out.println("\nCars: ");
         
         for (int i = 0; i < 5; i++) {
            System.out.println(cars[i]);
         }
    }
}
    
