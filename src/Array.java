import java.util.Random;

import static java.util.Collections.swap;

public class Array {
    int[] arr;

    public Array(int length) {
        arr = new int[length];

        Random rand = new Random();
        for(int i=0;i<length;i++){
            arr[i]  =rand.nextInt(10000)+1;
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

    public void shellsortHibbard(){

        int[] hibbardIncrements;

        int hibbardSize = (int) Math.floor(Math.log(arr.length+1)/Math.log(2));
        hibbardIncrements = new int[hibbardSize];
        for(int i=0;i<hibbardSize;i++){
            hibbardIncrements[i] = (int) (Math.pow(2, i+1)-1);
        }

        for(int r = hibbardSize-1;r>=0;r--){
            int gap = hibbardIncrements[r];

            for(int i=gap;i<arr.length;i++){
                int temp = arr[i];
                int j = i;
                for(;j>=gap && temp<arr[j-gap];j-=gap){
                    arr[j] = arr[j-gap];
                }
                arr[j]  =temp;
            }

//            System.out.print("After "+gap+"-sort: ");
//            printArr();
        }
    }

    public void shellsortKnuth(){
       // (3^k – 1) / 2

        int[] knuthIncr;

        int knuthSize = (int) Math.floor(Math.log(2*arr.length+1)/Math.log(3));
        knuthIncr = new int[knuthSize];
        for(int i=0;i<knuthSize;i++){
            knuthIncr[i] = (int) ((Math.pow(3, i+1)-1)/2);
        }

        for(int r = knuthSize-1;r>=0;r--){
            int gap = knuthIncr[r];

            for(int i=gap;i<arr.length;i++){
                int temp = arr[i];
                int j = i;
                for(;j>=gap && temp<arr[j-gap];j-=gap){
                    arr[j] = arr[j-gap];
                }
                arr[j]  =temp;
            }

//            System.out.print("After "+gap+"-sort: ");
//            printArr();
        }
    }

    public void shellsortSedgewick(){
        // (3^k – 1) / 2

        int[] sedgewickInc;

        int sedgewickSize = (int) Math.floor(Math.log(2*arr.length+1)/Math.log(3));
        sedgewickInc = new int[sedgewickSize];
        for(int i=0;i<sedgewickSize;i++){
            sedgewickInc[i] = (int) ((Math.pow(3, i+1)-1)/2);
        }

        for(int r = sedgewickSize-1;r>=0;r--){
            int gap = sedgewickInc[r];

            for(int i=gap;i<arr.length;i++){
                int temp = arr[i];
                int j = i;
                for(;j>=gap && temp<arr[j-gap];j-=gap){
                    arr[j] = arr[j-gap];
                }
                arr[j]  =temp;
            }

//            System.out.print("After "+gap+"-sort: ");
//            printArr();
        }
    }

    public void insertionsort(){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
//        System.out.print("Insertion: ");
//        printArr();
    }

}


