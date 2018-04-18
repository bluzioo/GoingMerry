package demo.algorithms.sort;

import demo.algorithms.RandomArray;

import java.util.Arrays;
import static demo.algorithms.Print.println;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void sort (int[] arr) {
        if (arr.length == 1) return;

        for (int i=1; i<arr.length; i++) {
            int j = i-1;
            int hand = arr[i];
            while( j>=0 && arr[j] > hand) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = hand;
        }
    }


    public static void main(String[] args) {
        int[] arr = RandomArray.random(1000000);

        long start = System.currentTimeMillis();

        sort(arr);

        println("taken time: " + (System.currentTimeMillis()-start));

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                println(false);
            }
        }
    }


}


