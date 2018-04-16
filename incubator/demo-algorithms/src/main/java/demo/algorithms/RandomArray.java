package demo.algorithms;

public class RandomArray {

    public static int[] random(int size) {
        int[] arr = new int[size];

        for (int i=0; i<size; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
