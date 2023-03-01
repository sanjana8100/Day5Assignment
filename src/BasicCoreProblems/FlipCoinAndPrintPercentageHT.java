package BasicCoreProblems;

import java.util.Scanner;

public class FlipCoinAndPrintPercentageHT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip the coin:");
        int numOfFlips= in.nextInt();
        double head=0, tail=0;
        if(numOfFlips>0){
            for(int i=0;i<=numOfFlips;i++){
                double random= Math.random();
                if(random<0.5)
                    head++;
                else
                    tail++;
            }
            System.out.println("*************************************************");
            System.out.println("The Percentage of Head VS Tails for flipping the coin "+numOfFlips+" number of times is as follows:");
            System.out.println("Head Probability: "+(head/numOfFlips));
            System.out.println("Tail Probability: "+(tail/numOfFlips));
        }
        else
            System.out.println("!!!Enter a valid number!!!");
    }
}
