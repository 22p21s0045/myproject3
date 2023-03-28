/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3;

/**
 *
 * @author Student
 */
public class lab3 {
    public static void main(String[] args) {
        try{
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
            System.out.println(1/0);
        }
        catch(NullPointerException ex){
            System.out.println("Exception");
            
        }
        finally{
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
    
}
