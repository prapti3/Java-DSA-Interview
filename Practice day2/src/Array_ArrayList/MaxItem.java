package Array_ArrayList;

import java.util.Arrays;

import static Array_ArrayList.Swap.swap;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {34,45,56};
         max(arr);
         reverse(arr);
         change(arr);
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
                start++;
                end--;


        }

    }


    static void max(int[] a){
        int maxVal = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > maxVal){
                maxVal = a[i];
            }

        }
        System.out.println(maxVal);



    }

    static void change(int[] arr){
        arr[0] = 99;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
    }
}
