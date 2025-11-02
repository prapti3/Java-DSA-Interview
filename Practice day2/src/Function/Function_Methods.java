package Function;

import java.util.Scanner;

public class Function_Methods {
    public static void main(String[] args){
//        Q. Take 2 number and print sum


        /*
        access modifier (we'll look in oop) return_type name(
{
//body

}

         */

sum();
sum();
sum();

    }

    public static void sum(){
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);

    }
}
