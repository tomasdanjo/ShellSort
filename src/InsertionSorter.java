import java.util.Timer;

public class InsertionSorter implements Runnable{

    Array arr;

    public InsertionSorter(Array arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        //
        long start  = System.currentTimeMillis();
        arr.insertionsort();
        long end = System.currentTimeMillis();


        System.out.println("Ended insertion in "+(end-start)+" ms");
    }



}
