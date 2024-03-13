import java.util.ArrayList;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Array arr = new Array(100000000);
//        System.out.print("Original Array: ");
//        arr.printArr();

        Thread shell = new Thread(new ShellSorter(arr));
        Thread insert = new Thread(new InsertionSorter(arr));

        shell.start();
        insert.start();
//        arr.shellsortHibbard();





    }



}