/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaApplication3;

/**
 *
 * @author alviar
 */
public class calculator {
    public static void main(String[] args) {
        
        //data structure Subject
        double prelim1 = 1.5, midterm1 = 1.25, final1 = 1.75;
        
        //Computer Programming subject
        double prelim2 = 1.25, midterm2 = 1.25, final2 = 2.0;
                
        //Pathfit Subject
        double prelim3 = 1.0, midterm3 = 1.5, final3 = 1.25;
        
        double datastruct = (prelim1 + midterm1 + final1) /3;
        double comprog = (prelim2 + midterm2+ final2) /3;
        double pathfit = (prelim3 + midterm3 + final3) /3;
        
        double overall = (datastruct + comprog + pathfit) /3;
        
        System.out.println("\n\tFinal Grade");
        System.out.println("\nData structure");
        System.out.println("Prelim: " + prelim1);
        System.out.println("Midterm: " + midterm1);
        System.out.println("Final: " + final1);
        System.out.println("Average: " + datastruct );
        
        System.out.println("\nComputer Programming");
        System.out.println("Prelim: " + prelim2);
        System.out.println("Midterm: " + midterm2);
        System.out.println("Final: " + final2);
        System.out.println("Average: " + comprog);
        
        System.out.println("\nPathfit");
        System.out.println("Prelim: " + prelim3);
        System.out.println("Midterm: " + midterm3);
        System.out.println("Final: " + final3);
        System.out.println("Average: " + pathfit);
        
        System.out.println("\nOverall average: " + overall);
        
    }
}
