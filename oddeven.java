
package lab3;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int check = 0;
        int checkeven = 0;
        while (num != -1){
        if (num%2==0){
            check++;
        }
        else{
            checkeven++;
        }
       num = myObj.nextInt();
    }
        checkeven +=1;
        System.out.println("Odd number = " + check + " and Even number = "+ checkeven);
    }
}
