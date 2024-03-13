public class ShellSorter implements Runnable{
    Array arr;

    public ShellSorter(Array arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        long start  = System.currentTimeMillis();
        arr.shellsortKnuth();
        long end = System.currentTimeMillis();

        System.out.println("Ended shell in "+(end-start)+" ms");
    }



}
