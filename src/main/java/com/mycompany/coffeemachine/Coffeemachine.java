/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coffeemachine;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Александра
 */

public class Coffeemachine {
    

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt(); 
        int third = scanner.nextInt(); 

        System.out.println((((first+second) == 20) || ((first + third) == 20) || ((third + second == 20))));
        scanner.close();
        
        
        
        
 

        // TODO: Refactor variable names and print the results
    }
}

