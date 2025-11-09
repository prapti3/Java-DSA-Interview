package Function;

import java.util.Scanner;

public class Sum {
    

    public static void main(String[] args){
        int result = sum();
        System.out.println("The sum is: " + result);

        int result3 = sum3(5, 10);
        System.out.println("The sum from sum3 is: " + result3);
    }


    static int sum3(int a, int b){
        int sum = a + b;
        return sum;

    }
    
    static int sum(){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = in.nextInt();
    System.out.print("Enter second number: ");
    int num2 = in.nextInt();

    int sum = num1 + num2;
   
    return sum;
    
    }
}
