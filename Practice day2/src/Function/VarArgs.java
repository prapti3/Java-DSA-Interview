package Function;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(2,3,4,5);
        multiple(2,3,"kunal","Rahul");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a);


    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }

}
