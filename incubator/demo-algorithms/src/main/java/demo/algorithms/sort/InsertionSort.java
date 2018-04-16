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
        int[] arr = RandomArray.random(50);

        println(Arrays.toString(arr));

        sort(arr);

        println(Arrays.toString(arr));
    }


}


