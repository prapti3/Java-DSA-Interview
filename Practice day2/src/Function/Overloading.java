package Function;

public class Overloading {
    public static void main(String[] args){
         fun(45);
        fun2("Kunal");
        sum(3,4);

    }
    static void sum(int a, int b){
        int sum = a +b;
        System.out.println(sum);
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);

    }
    static void fun2(String name){
        System.out.println("Second one");
        System.out.println(name);

    }
}
