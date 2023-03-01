package FunctionalPrograms;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows in the array:");
        int row= in.nextInt();
        System.out.println("Enter the number of columns in the array:");
        int column= in.nextInt();
        int[][] array= new int[row][column];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]= in.nextInt();
            }
        }

        System.out.println("**********************************************************");
        System.out.println("The given array is as follows:\n");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
