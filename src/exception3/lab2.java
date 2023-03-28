/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3;

/**
 *
 * @author Student
 */
public class lab2 {

    public static void main(String[] args) {
        try {
            int[] lists = new int[10];
            System.out.println(lists[10]);

        } 
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Out of index");
        }
        catch (RuntimeException e){
            System.out.println("Run time exception");
            
        }
        
        

    }

}
