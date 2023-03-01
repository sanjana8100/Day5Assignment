package BasicCoreProblems;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Dividend and the Divisor:");
        int dividend = in.nextInt();
        int divisor = in.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("********************************");
        System.out.println("The Quotient is: "+quotient);
        System.out.println("The Remainder is: "+remainder);
    }
}
