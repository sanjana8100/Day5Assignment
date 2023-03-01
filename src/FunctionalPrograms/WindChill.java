package FunctionalPrograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the Temperature in Fahrenheit:");
        double temp= in.nextDouble();
        System.out.println("Enter the value of Wind Speed in miles per hour:");
        double windspeed= in.nextDouble();

        double windchill= 35.74 + 0.6215 * temp + (0.4275 * temp -35.75) * Math.pow(windspeed,0.16);
        System.out.println("The National Weather Service defines the effective Wind Chill to be: " +windchill);
    }
}
