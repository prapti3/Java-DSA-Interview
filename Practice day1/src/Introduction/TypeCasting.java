package Introduction;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        auto type casting ==> widening
//        float fnum = input.nextFloat();
//        System.out.println(fnum);

//        int a = 345;
//        byte b = (byte)(a);
//        System.out.println(b);

//        manual type casting ==> narrowing
//        int num = (int)(44.5f);
//        System.out.println(num);


//        byte a = 40;
//        byte b= 50;
//        byte c = 100;
//        int d = (a*b) /c;
//        System.out.println(d);


//        byte b = 40;
//        b = b *2;
////
//        int num = 'A';
//        System.out.println(num);


        byte b = 34;
         char c = 'a';
         short s = 1024;
         int i = 40000;
         float f = 3.4f;
         double d = 0.123;
         double result = (f * b) + (i / c) - (d -s);
        System.out.println((f*b) + " " + (i/c) + " " + (d -s ));
        System.out.println(result);








    }
}
