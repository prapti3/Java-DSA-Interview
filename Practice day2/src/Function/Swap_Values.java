package Function;

public class Swap_Values {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
//
//        int temp = a;
//        a =b;
//        b = temp;
//
//        System.out.println(a);
//        System.out.println(b);


        System.out.println(a+ " " + b);

        String name = "Prapti";
        changeName(name);
        System.out.println(name);



    }

    static void changeName(String name){
        name = "Rahul ";
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;



    }
}
