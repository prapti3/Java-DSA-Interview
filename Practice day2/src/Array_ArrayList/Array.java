package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
//        store 3 roll numbers
        int a = 4;
        int b = 5;
        int c = 7;

//        store person's name
        String n1 = "Kunal";
        String n2 = "Prachi";

//        Array syntax
//        datatype[] variable_name = new int[5];
//        int[] rollno = new int[5];
//        or
//        datatype[] var_name = {1,2,3,4,5};
        int[] rollno2 = {1,2,3,4,5};

        int[] ros;
        ros = new int[5];

//        String str = null;
//        int num = 0;
//        System.out.println(str);
//        System.out.println(num);

//        String[] arr = new String[3];
//        System.out.println(arr[0]);



//        array of primitive =>
        int[] rollno = new int[5];
        rollno[0] = 45;
        rollno[1] = 34;
        rollno[2] = 55;
        rollno[3] = 565;


        System.out.println(rollno[1]);

        int[] arr2 = new int[4];
        Scanner in = new Scanner(System.in);

//        for(int i =0;i<arr2.length; i++){
////            System.out.println(i+1  + " = " + rollno[i]);
//            System.out.print(i + " = ");
//            arr2[i] = in.nextInt();
//
//        }

//        for(int i=0; i<arr2.length; i++){
//
//
//        }


//        for-each loop
//        for( int  j : arr2){
//            System.out.print(j + " ");
//        }

//        toString() method

//        System.out.println(Arrays.toString(arr2));   //best way to print the array

      //array of object
        String[] str = new String[4];
        for(int i=0;i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));








    }
}
