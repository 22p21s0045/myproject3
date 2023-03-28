/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Exception3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int number1 = inputs.nextInt();
        int number2 = inputs.nextInt();
       try{
           System.out.println(number1+ "/" + number2+"is"+number1/number2);
       }
       catch(ArithmeticException ex){
           System.out.println("Divisor by zero");
       }
         }
             
         }
        
    

