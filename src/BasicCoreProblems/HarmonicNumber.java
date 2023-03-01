package BasicCoreProblems;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num= in.nextInt();
        float harmonic_value=1;
        for(int i=2;i<=num;i++){
            harmonic_value= harmonic_value+(float)1/i;
        }
        System.out.println("The Nth Harmonic Value where N="+num+" is: "+harmonic_value);
    }
}
