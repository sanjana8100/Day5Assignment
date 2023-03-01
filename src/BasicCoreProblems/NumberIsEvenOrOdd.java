package BasicCoreProblems;

import java.util.Scanner;

public class NumberIsEvenOrOdd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        System.out.println("*******************************************");
        if(num%2==0)
            System.out.println(num+" is a EVEN number.");
        else
            System.out.println(num+" is an ODD number.");
    }
}
