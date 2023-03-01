package FunctionalPrograms;

import java.util.Scanner;

public class SumOfThreeIntegersAddsToZero {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int num= in.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array= new int[num];
        for(int i=0;i<num;i++)
            array[i]= in.nextInt();
        boolean found= false;
        System.out.println("****************************************************");
        System.out.println("The triplets found in the array with 0 sum are:");
        for(int i=0;i<num-2;i++){
            for(int j=i+1;j<num-1;j++){
                for(int k=j+1;k<num;k++){
                    if(array[i]+array[j]+array[k] == 0){
                        System.out.println(array[i]+" "+array[j]+" "+array[k]);
                        found= true;
                    }
                }
            }
        }
        if(found == false)
            System.out.println("!!!No Triplet is found with 0 sum in the given array!!!");
    }
}
