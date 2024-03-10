import java.util.Random;

import static java.util.Collections.swap;

public class Array {
    int[] arr;

    public Array(int length) {
        arr = new int[length];

        Random rand = new Random();
        for(int i=0;i<length;i++){
            arr[i]  =rand.nextInt(100)+1;
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void printArr(){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void shellsort(){
        for(int gap = arr.length/2;gap>0;gap/=2){


            for(int i=gap;i<arr.length;i++){
                int temp = arr[i];
                int j = i;
                for(;j>=gap && temp<arr[j-gap];j-=gap){
                    arr[j] = arr[j-gap];
                }
                arr[j]  =temp;
            }

            System.out.print("After "+gap+"-sort: ");
            printArr();
        }
    }

}


