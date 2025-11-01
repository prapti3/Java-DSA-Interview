package Conditional_Loops.Switch_Case;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        if(fruit.equals("mango")){
            System.out.println("king of fruit");
        }
        if(fruit.equals("apple")){
            System.out.println("a sweet red fruit");
        }


    }
}
