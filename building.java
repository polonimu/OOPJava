package lab3;

import java.util.Scanner;

public class building {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Plase enter the hight of the building :");
        int height = myObj.nextInt();
        for (int i = 0; i <= height; i++){
            System.out.println("#-#-#-#-#");
            
        }
    }
}
