package BasicCoreProblems;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1= in.nextInt();
        int num2= in.nextInt();
        System.out.println("*********************************************************");
        System.out.println("The Original values of the two numbers are:");
        System.out.println("Number1: "+num1+"     Number2: "+num2);
        int temp= num1;
        num1= num2;
        num2= temp;
        System.out.println("The values of the two numbers after swapping:");
        System.out.println("Number1: "+num1+"     Number2: "+num2);
    }
}
