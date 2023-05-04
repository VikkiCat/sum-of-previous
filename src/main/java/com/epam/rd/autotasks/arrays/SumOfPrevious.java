package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        boolean [] isSum = new boolean[array.length];
        isSum[0] = false;
        isSum[1] = false;

           for (int i = 2; i < array.length ; i++) {
               if(array[i]==array[i-2]+array[i-1]){
                   isSum[i] = true;
               } else  isSum[i] = false;
           }
          return isSum;
    }
}
