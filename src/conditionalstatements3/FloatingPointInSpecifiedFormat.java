/*
Conditional Statement exercise 3
 */
package conditionalstatements3;

import java.util.Scanner;

public class FloatingPointInSpecifiedFormat {

    public static void main(String[] args) {
        //Print a floating pont number in a specified format
        System.out.println("Print a floating pont number in a specified format");
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        double input = in.nextDouble();
        if(input > 0){
            if(input < 1){
                System.out.println("Positive small numer \n");
            }else if(input > 1000000){
                System.out.println("Positive large number \n");
            }else{
                System.out.println("Positive number \n");
            }
        }else if(input < 0){
            if(Math.abs(input) < 1){
                System.out.println("Negative small number \n");
            }else if(Math.abs(input) > 1000000){
                System.out.println("Negative large number \n");
            }else{
                System.out.println("Negative number \n");
            }
        }else{
            System.out.println("Zero");
        }
    }
}
