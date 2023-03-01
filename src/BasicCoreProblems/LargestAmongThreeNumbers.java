package BasicCoreProblems;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values for a,b and c:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("***********************************");
        System.out.println("The values entered are:");
        System.out.println("a:" + a + "  b:" + b + "  c:" + c);
        if (a >= b && a >= c)
            System.out.println(a + " is the Largest number.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the Largest number.");
        else
            System.out.println(c + " is the Largest number.");
    }
}
