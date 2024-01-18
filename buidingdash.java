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
public class buidingdash {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int k = num.nextInt();
        for (int y =0; y > 5; y++){
            for (int x =0; x < k; x++){
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
