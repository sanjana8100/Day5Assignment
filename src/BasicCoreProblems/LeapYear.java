package BasicCoreProblems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = in.nextInt();
        if(year>=1000&&year<10000){
            if(((year%4==0)&&(year%100!=0))||(year%400==0)){
                System.out.println("It is a Leap Year");
            }
            else{
                System.out.println("It is not a Leap Year");
            }
        }
        else
            System.out.println("!!!Enter a valid year!!!");
    }
}
