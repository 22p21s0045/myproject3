/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception3;

/**
 *
 * @author Student
 */
public class Lab6 {

    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("List[10] is " + list[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
//            e.printStackTrace();
            System.out.println(e.toString());
            StackTraceElement[] array = e.getStackTrace();
            for(int i = 0 ; i < array.length;i++){
                 System.out.println(array[0].getClassName());
            System.out.println(array[i].getMethodName());
            System.out.println(array[i].getFileName());
            System.out.println(array[i].getLineNumber());
            }
            System.out.println(array.length);
            System.out.println(array[0].getClassName());
            System.out.println(array[0].getMethodName());
            System.out.println(array[0].getFileName());
            System.out.println(array[0].getLineNumber());
        }
    }
}
