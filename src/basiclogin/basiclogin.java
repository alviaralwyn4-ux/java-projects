/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package basiclogin;

/**
 *
 * @author alviar
 */
import java.util.Scanner;
public class basiclogin {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String user = "Admin";
        String pass = "admin123";
        
        System.out.print("User Name: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        
        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Login Succesfully!Welcome Admin!");
        }
        else {
            System.out.println("Wronng credentials!");
        }   
    }
    
}
