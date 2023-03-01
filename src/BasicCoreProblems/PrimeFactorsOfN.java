package BasicCoreProblems;

import java.util.Scanner;

public class PrimeFactorsOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        System.out.println("The Prime factors of "+num+" are: ");
        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        if(num>2)
            System.out.println(num);
    }
}
