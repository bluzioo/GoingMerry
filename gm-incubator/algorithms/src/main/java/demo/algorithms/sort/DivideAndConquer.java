package demo.algorithms.sort;

import demo.algorithms.RandomArray;

import java.util.Arrays;

import static demo.algorithms.Print.println;

/**
 * 分治法
 */
public class DivideAndConquer {

    public static void merge (int[] arr, int p, int q, int r) {
        int n1 = q-p+1;
        int n2 = r-q;

        int[] left = new int[n1+1];
        int[] right = new int[n2+1];

        for (int i=0; i<n1; i++) {
            left[i] = arr[p+i];
        }
        for (int i=0; i<n2; i++) {
            right[i] = arr[q+i+1];
        }

        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        while(p <= r) {
            if (left[i] <= right[j]) {
                arr[p] = left[i];
                i++;
            } else {
                arr[p] = right[j];
                j++;
            }

            p++;
        }
    }

    public static void sort(int[] arr, int p, int r) {
        if (p<r){
            int q = (p+r)/2;
            sort(arr, p, q);
            sort(arr, q+1, r);
            merge(arr, p, q, r);
        }
    }


    public static void main(String[] args) {
        int[] arr = RandomArray.random(1000000);

        long start = System.currentTimeMillis();

        sort(arr, 0, arr.length-1);

        println("taken time: " + (System.currentTimeMillis()-start));

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                println(false);
            }
        }
    }
}
