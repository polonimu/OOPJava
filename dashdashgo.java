/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class dashdashgo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Please insert a number :");
        int number = myObj.nextInt();
        for (int i = 1; i <= number; i++){
            if (i % 5 ==0){
                System.out.println("|");
            }else{
                System.out.print("|");
            }
        }
    }
}