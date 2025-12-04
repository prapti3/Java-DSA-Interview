package Array_ArrayList;


import java.util.Arrays;
import java.util.Scanner;

public class Array_2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

   /*
   [
       [],
       [],
       []
    ]


    1 2 3
    4 5 6
    7 8 9

    */



        int[][] arr = new int[3][3];

        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

//        input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//        output


//        --> long form
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println(" ");
//        }


//        --> short form

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        enhanced for loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

//        for (int row = 0; row < arr2.length; row++) {
//            for (int col = 0; col < arr2[row].length; col++) {
//                System.out.print(arr2[row][col]);
//            }
//            System.out.println(" ");
//        }

//        for (int row = 0; row < arr2.length; row++) {
//            System.out.println(Arrays.toString(arr2[row]));
//
//        }


    }
}
