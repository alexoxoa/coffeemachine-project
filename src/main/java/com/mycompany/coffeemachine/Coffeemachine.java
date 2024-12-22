/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coffeemachine;
import java.util.Scanner;

/**
 *
 * @author Александра
 */

public class Coffeemachine {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Write how many cups of coffee you will need:");
        int count = scan.nextInt();
        int one_water = 100; 
        int one_milk = 50;
        int one_bean = 15; 
        System.out.println ("For " + count +" cups of coffee you will need:");
        
        System.out.println (count*one_water +" ml of water");
        System.out.println (count*one_milk +" ml of milk");
        System.out.println (count*one_bean +" g of coffee beans");
        scan.close();
        
 

        // TODO: Refactor variable names and print the results
    }
}

