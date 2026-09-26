/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decisionmaking;

/**
 *
 * @author alviar
 */
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Grade: ");
        int grade = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Submitted Requirments? Y/N");
        char req = sc.nextLine().charAt(0);
        
        boolean hasSubmitted;
        
        if ((req == 'Y')||( req == 'y')) {
             hasSubmitted = true;
        }
        else {
             hasSubmitted = false;
        }
        
        if (grade >= 75 && hasSubmitted ) {
            System.out.println("You can Enroll");
        }
        else{
            System.out.println("You cant Enroll");
        }
    }
    
}
