package BasicCoreProblems;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= in.nextInt();
        int powOfTwo=1;
        System.out.println("*********************************************");
        System.out.println("The table of powers of the 2 are as follows:");
        for(int i=0;i<=num;i++){
            System.out.println("   "+i+"  :  "+powOfTwo);
            powOfTwo*=2;
        }
    }
}
